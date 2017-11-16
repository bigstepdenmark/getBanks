package dk.cphsoftdev.app;

import dk.cphsoftdev.app.controller.ReceiverController;
import dk.cphsoftdev.app.controller.SenderController;
import dk.cphsoftdev.app.controller.ServiceController;
import dk.cphsoftdev.app.entity.Bank;
import dk.cphsoftdev.app.entity.Loan;


public class Main
{
    public static void main( String[] args ) {
        ReceiverController receiver = new ReceiverController("group3.creditscore.getbanks1","datdb.cphbusiness.dk","guest");
        SenderController sender = new SenderController("guest","datdb.cphbusiness.dk","group3.getbanks.reciplist");


        if(receiver.isReady()){
               for (String msg: receiver.getMessages()) {
                        sender.SendMSG(new Bank().getTSIds() + " | " + new Loan().toString());
               }
                 sender.close();
                 receiver.close();
        }
    }


}
