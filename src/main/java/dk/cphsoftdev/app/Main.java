package dk.cphsoftdev.app;

import dk.cphsoftdev.app.controller.ReceiverController;
import dk.cphsoftdev.app.controller.SenderController;


/**
 * Hello world!
 */
public class Main
{
    public static void main( String[] args ) {
        ReceiverController receiver = new ReceiverController("group3.creditscore.getbanks1","datdb.cphbusiness.dk","guest");
        SenderController send = new SenderController("guest","datdb.cphbusiness.dk","group3.getbanks.reciplist");

        if(receiver.isReady()){
               for (String msg: receiver.getMessages()) {
                        send.SendMSG(msg);
                }
                        send.close();
                        receiver.close();
        }
    }
}
