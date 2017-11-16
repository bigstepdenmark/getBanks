package dk.cphsoftdev.app.controller;


import org.apache.commons.lang3.math.NumberUtils;

public class Validator {

    private boolean isSsn(String ssn){
        return NumberUtils.isCreatable(ssn) && ssn.length() == 10;
    }

    private boolean isCreditScore(String creditScore){ return NumberUtils.isCreatable(creditScore); }

    private boolean isLoanAmount(String loanAmount){ return NumberUtils.isCreatable(loanAmount); }

    private boolean isDuration(String duration){ return NumberUtils.isCreatable(duration); }

    public boolean isValid(String request){
        String[] values = request.split( "," );
        boolean requestLength = values.length == 4;
        boolean validRequest = isSsn(values[0]) &&
                               isCreditScore(values[1]) &&
                               isLoanAmount(values[2]) &&
                               isDuration(values[3]);
        return requestLength && validRequest;
    }


}
