// This applications purpose is determine the most appropriate banks from rule base web service
package dk.cphsoftdev.app.entity;

public class Bank {

    private int minCreditScore;
    private String name;
    private int id;

    public Bank(int minCreditScore, String name, int id) {
        this.minCreditScore = minCreditScore;
        this.name = name;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "minCreditScore=" + minCreditScore +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


}



