package com.Lab12_3;

public class TransactionRecord {
    private int accNO;
    private double transAmount;
    public TransactionRecord(int accNO,double transAmount){
        this.accNO = accNO;
        this.transAmount = transAmount;
    }

    public int getAccNO() {
        return accNO;
    }

    public void setAccNO(int accNO) {
        this.accNO = accNO;
    }

    public double getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(double transAmount) {
        this.transAmount = transAmount;
    }
}
