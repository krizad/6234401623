package com.Lab12_3;

public class AccountRecord {
    private int acctNo;
    private String name;
    private double balance;
    private int transCnt = 0; // นับว่า บัญชีนี้ทารายการ transaction ไปกี่ครั้ง
    public AccountRecord (int acctNo, String name, double balance) {
        this.acctNo = acctNo;
        this.name = name;
        this.balance = balance;
    }
    public int getAcctNo() { return acctNo; }
    public String getName() { return name; }
    public double getBalance(){ return balance; }
    public int getTransCnt() { return transCnt; }
    public void combine(TransactionRecord t){
        if (t.getAccNO() == this.acctNo){
            balance += t.getTransAmount();
            transCnt++;
        }
    }
}
