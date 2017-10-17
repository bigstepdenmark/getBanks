package dk.cphsoftdev.app.controller;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;
import dk.cphsoftdev.app.entity.Bank;

import java.io.IOException;
import java.util.concurrent.TimeoutException;


public class SenderController {
       private String username,
                      queueName,
                      host;
       private Connection connection;
       private Channel channel;
       private ConnectionFactory factory;


    public SenderController(String username, String queueName, String host) {
        this.username = username;
        this.queueName = queueName;
        this.host = host;
        connect();
    }

    private boolean connect() {
        try
        {
            return createFactory() && newConnection() && createChannel();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(TimeoutException e)
        {
            e.printStackTrace();
        }

        return false;
    }


    public boolean close(){
        try {
            channel.close();
            connection.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean createFactory(){
        if(factory == null){factory = new ConnectionFactory();}

        factory.setHost(host);
        factory.setUsername(username);

        return factory.getHost().equals(host);
    }

    private boolean newConnection() throws IOException, TimeoutException {

        if( connection == null )
            connection = factory.newConnection();

        return connection.isOpen();
    }

    private boolean createChannel() throws IOException, TimeoutException {
        if( channel == null )
            channel = connection.createChannel();

        return channel.isOpen();
    }

    public void SendMSG(Bank bank){
         String response = "Message was not delivered!";

        if(isValid(bank)){
            response =  Publish( bank );
        }

        System.out.println(response);
    }

    private boolean isValid(Bank bank){
         return bank.getName() != null && bank.getMinCreditScore() >= 0;
    }


    private String Publish(Bank bank){
        MessageController msg = new MessageController(bank);
        try {
            channel.queueDeclare(queueName,false,false,false,null);
            channel.basicPublish("",queueName,null,msg.asByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
         return "[Sent] --> '" + msg.asString() + "'";
    }


}
