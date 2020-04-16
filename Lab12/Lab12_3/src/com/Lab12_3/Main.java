package com.Lab12_3;

public class Main {

    public static void main(String[] args) {
	FileMatch newMaster = new FileMatch("src\\master.txt","src\\trans.txt");
    System.out.println("Total Account Record : "+newMaster.getTotalAccountRecord());
    System.out.println("Total balance : "+newMaster.getTotalBalance());
    System.out.println("No transaction : "+newMaster.getNoTransCounter()+" account(s)");
    }
}
