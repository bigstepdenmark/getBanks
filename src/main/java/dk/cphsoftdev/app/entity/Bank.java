// This applications purpose is determine the most appropriate banks from rule base web service
package dk.cphsoftdev.app.entity;

public class Bank {

    private int minCreditScore;
    private String name;
    private int TSId;


    public Bank(int minCreditScore, String name, int TSId) {
        this.minCreditScore = minCreditScore;
        this.name = name;
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

    public int getTSId() {
        return TSId;
    }

    public void setTSId(int TSId) {
        this.TSId = TSId;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "minCreditScore=" + minCreditScore +
                ", name='" + name + '\'' +
                ", TSId=" + TSId +
                '}';
    }
    
}



