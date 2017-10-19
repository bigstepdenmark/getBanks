package dk.cphsoftdev.app.controller;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ReceiverController {

    private String queueName;
    private String host;
    private String username;
    private ConnectionFactory factory;
    private Connection connection;
    private Channel channel;

    public ReceiverController(String queueName, String host, String username) {
        this.queueName = queueName;
        this.host = host;
        this.username = username;
    }

    public void printMessages() {
        try {
            handleDelivery();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean connect() {
        try {
            return createFactory() && newConnection() && createChannel();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean close() {
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

    private void handleDelivery() throws IOException {
        channel.queueDeclare(queueName, false, false, false, null);
        System.out.println("\nWaiting for messages. To exit press CTRL+C");
        System.out.println("====================================================");

        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println("[Received] --> '" + message + "'");

                // Get message attributes ( EXAMPLE )
                MessageController mc = new MessageController(message);
                System.out.println("SSN: " + mc.getAttribute("ssn").asText());
                System.out.println("Credit Score: " + mc.getAttribute("creditScore").asInt());
            }
        };

        channel.basicConsume(queueName, true, consumer);
    }

    private boolean createFactory() {
        if (factory == null)
            factory = new ConnectionFactory();

        // datdb.cphbusiness.dk or localhost
        factory.setHost(host);

        // student or guest
        factory.setUsername(username);

        // cph or guest
        // factory.setPassword( "cph" );

        // 5672 if local else 15672
        // factory.setPort( 15672 );

        return factory.getHost().equals(host);
    }

    private boolean newConnection() throws IOException, TimeoutException {
        if (connection == null)
            connection = factory.newConnection();

        return connection.isOpen();
    }

    private boolean createChannel() throws IOException, TimeoutException {
        if (channel == null)
            channel = connection.createChannel();

        return channel.isOpen();
    }


}
