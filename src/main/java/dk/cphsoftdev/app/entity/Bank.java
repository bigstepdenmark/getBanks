// This applications purpose is determine the most appropriate banks from rule base web service
package dk.cphsoftdev.app.entity;

public class Bank {

    private int minCreditScore;
    private String name;
    private String TSId;


    public Bank( String TSId) {
        this.TSId = TSId;
    }


    public int getMinCreditScore() {
        return minCreditScore;
    }

    public void setMinCreditScore(int minCreditScore) {
        this.minCreditScore = minCreditScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTSId() {
        return TSId;
    }

    public void setTSId(String TSId) {
        this.TSId = TSId;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "minCreditScore=" + minCreditScore +
                ", name='" + name + '\'' +
                ", TSId='" + TSId + '\'' +
                '}';
    }
}



