package com.Lab12_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class FileMatch {
    private ArrayList<AccountRecord> accLst = new ArrayList<>();
    private ArrayList<TransactionRecord> transLst = new ArrayList<>();
    private String fileMasterName;
    private String fileTransName;
    private int totalRec;
    private double totalBalance;
    private int noTransCnt;
    public FileMatch(String fileMasterName,String fileTransName){
        this.fileMasterName = fileMasterName;
        this.fileTransName = fileTransName;
        addAccLst();
        addTransLst();
        match();
        writeNewMaster();
    }
    private void addAccLst(){
        try(Scanner scanner = new Scanner(new File(fileMasterName))) {
            while(scanner.hasNextLine()){
                String[] line = scanner.nextLine().split(" ",4);
                int accNo = Integer.parseInt(line[0]);
                String name = line[1]+" "+line[2];
                double balance = Double.parseDouble(line[3]);
                accLst.add(new AccountRecord(accNo,name,balance));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private void addTransLst(){
        try(Scanner scanner = new Scanner(new File(fileTransName))) {
            while(scanner.hasNextLine()){
                String[] line = scanner.nextLine().split(" ",2);
                int accNo = Integer.parseInt(line[0]);
                double transAmount = Double.parseDouble(line[1]);
                transLst.add(new TransactionRecord(accNo,transAmount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private void match(){
        for (AccountRecord acc:accLst) {
            for (TransactionRecord trans:transLst) {
                if(acc.getAcctNo() == trans.getAccNO()){
                    acc.combine(trans);
                }
            }
        }
    }
    private void writeNewMaster(){
        try (RandomAccessFile r = new RandomAccessFile("newMaster.dat","rw")){
            for (AccountRecord a:accLst) {
                r.writeInt(a.getAcctNo());
                for (int i = 0;i<30;i++) {
                    if(i<a.getName().length()){
                        r.writeByte(a.getName().charAt(i));
                    }
                    else{r.writeByte(' ');}
                }
                r.writeDouble(a.getBalance());
                r.writeInt(a.getTransCnt());
                r.writeByte('\n');
                totalRec++;
            }
            //1 line has 46 bytes
            for (int i = 42; i < 187; i+=47) {
                r.seek(i);
                if (r.readInt() == 0){
                    noTransCnt++;
                }
            }
            for (int i = 34; i < 187; i+=47) {
                r.seek(i);
                totalBalance+=r.readDouble();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int getTotalAccountRecord() {
        return totalRec;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public int getNoTransCounter() {
        return noTransCnt;
    }
}
