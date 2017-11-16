package dk.cphsoftdev.app.controller;

import dk.cphsoftdev.app.webservice.Bank;
import dk.cphsoftdev.app.webservice.BankControllerService;

import java.util.Iterator;
import java.util.List;

public class ServiceController {
    private int creditScore;
    private String loanRequest;

    public ServiceController(int creditScore, String loanRequest) {
        this.creditScore = creditScore;
        this.loanRequest = loanRequest;
    }

    public List<Bank> getBanks(){
        BankControllerService service = new BankControllerService();
        return service.getBankControllerPort().getFilteredBanks(creditScore);
    }

    public String generateBankIds(){
        StringBuilder builder = new StringBuilder();

        List<Bank> banks = getBanks();
        Iterator<Bank> bankIterator = banks.iterator();
        while(bankIterator.hasNext()){
            Bank bank = bankIterator.next();
                builder.append(bank.getId());
            if(!bankIterator.hasNext()){
                builder.append("|");
            }else{
                builder.append(",");
            }
        }
        return builder.toString();
    }

    public String recipListRequest(){
        return generateBankIds() + loanRequest ;
    }

    // Delete when finished
    public static void main(String[] args) {
        ServiceController s = new ServiceController(50, "1234567890,600,100.0,36");

        String a = s.recipListRequest();

        System.out.println(a);
    }
}
