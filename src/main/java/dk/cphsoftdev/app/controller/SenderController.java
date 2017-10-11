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

    public boolean createFactory(){
        if(factory == null){factory = new ConnectionFactory();}

        factory.setHost(host);
        factory.setUsername(username);

        return factory.getHost().equals(host);
    }

    public boolean newConnection(){


        return true;


    }

    public void SendMSG(Bank bank){
         String response = "Message was not delivered!";

        if(isValid(bank)){
            response =  basicPublish( bank );
        }

        System.out.println(response);
    }

    private boolean isValid(Bank bank){
         return bank.getBankName() != null && bank.getCreditScore() >= 0 && bank.getMinCreditScore() >= 0;
    }

    private String basicPublish(Bank bank){




        return null;
    }

}
