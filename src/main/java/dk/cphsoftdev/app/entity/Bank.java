package dk.cphsoftdev.app.entity;


public class Bank {
   private int creditScore;
   private int minCreditScore;
   private String bankName;

    public Bank(int creditScore, int minCreditScore, String bankName) {
        this.creditScore = creditScore;
        this.minCreditScore = minCreditScore;
        this.bankName = bankName;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public int getMinCreditScore() {
        return minCreditScore;
    }

    public void setMinCreditScore(int minCreditScore) {
        this.minCreditScore = minCreditScore;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "creditScore=" + creditScore +
                ", minCreditScore=" + minCreditScore +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
