package dk.cphsoftdev.app.controller;

import org.apache.commons.lang3.SerializationUtils;
import com.rabbitmq.client.*;
import java.io.IOException;

public class Recipient {

    private final static String QUEUE_NAME = "12345";

    public static void main(String[] argv) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("datdb.cphbusiness.dk"); // datdb.cphbusiness.dk or localhost
        factory.setUsername("guest"); // student or guest
        // factory.setPassword( "cph" ); // cph or guest
        //factory.setPort( 15672 ); // 5672 if local else 15672
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
        Consumer consumer = new DefaultConsumer(channel) {

            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)
                    throws IOException {

                String message = new String(body, "UTF-8");
                //byte [] data = new byte[];

                Object object = SerializationUtils.deserialize(message.getBytes());

                System.out.println(" [x] Received '" + object + "'");
            }
        };
        channel.basicConsume(QUEUE_NAME, true, consumer);
    }
}
