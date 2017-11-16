package dk.cphsoftdev.app.entity;
public class Loan {

    private int creditScore,duration;
    private String ssn;
    private String loanAmount;

    public Loan(String ssn, int creditScore, String loanAmount, int duration) {
        this.ssn = ssn;
        this.creditScore = creditScore;
        this.loanAmount = loanAmount;
        this.duration = duration;
    }

    public Loan() {
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getDate() {
        return duration;
    }

    public void setDate(int date) {
        this.duration = date;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "ssn=" + ssn +
                ", creditScore=" + creditScore +
                ", loanAmount=" + loanAmount +
                ", date=" + duration +
                '}';
    }
}
