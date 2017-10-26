package dk.cphsoftdev.app;

import dk.cphsoftdev.app.controller.ReceiverController;
import dk.cphsoftdev.app.controller.SenderController;
import dk.cphsoftdev.app.entity.Bank;
import dk.cphsoftdev.app.entity.Loan;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ) {
        ReceiverController receiver = new ReceiverController("group3.creditscore.getbanks","datdb.cphbusiness.dk","guest");
        SenderController send = new SenderController("guest","group3.getbanks.reciplist","datdb.cphbusiness.dk");

        if(receiver.isReady()){
                for (String msg: receiver.getMessages()) {

                        send.SendMSG(msg);
                }
            }

        send.close();
        receiver.close();
    }
}
