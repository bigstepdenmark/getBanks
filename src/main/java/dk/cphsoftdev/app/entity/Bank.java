// This applications purpose is determine the most appropriate banks from rule base web service
package dk.cphsoftdev.app.entity;

import java.util.ArrayList;

public class Bank {

    private int minCreditScore;
    private String name;
    private ArrayList<String> TSIds;

    public Bank() {
    }

    public Bank(ArrayList<String> TSIds) {
        this.TSIds = TSIds;
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

    public ArrayList<String> getTSIds() {
        return TSIds;
    }

    public void setTSId(ArrayList<String> TSIds) {
        this.TSIds = TSIds;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "minCreditScore=" + minCreditScore +
                ", name='" + name + '\'' +
                ", TSIsd=" + TSIds +
                '}';
    }
}



