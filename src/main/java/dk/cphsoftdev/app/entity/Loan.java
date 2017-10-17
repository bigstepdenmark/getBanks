package dk.cphsoftdev.app.entity;
public class Loan {

    private int ssn;
    private int creditScore;
    private int loanAmount;
    private String date;

    public Loan(int ssn, int creditScore, int loanAmount, String date) {
        this.ssn = ssn;
        this.creditScore = creditScore;
        this.loanAmount = loanAmount;
        this.date = date;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "ssn=" + ssn +
                ", creditScore=" + creditScore +
                ", loanAmount=" + loanAmount +
                ", date='" + date + '\'' +
                '}';
    }
}
