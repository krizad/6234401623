package com.Lab12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File fileName = new File("data.txt");
        PrintWriter writer = new PrintWriter(fileName);
        Scanner scannerInput = new Scanner(System.in);
        String text;
        text = scannerInput.nextLine();
        while (!(text.contains("quit"))){
            writer.println(text);
            text = scannerInput.nextLine();
        }
        writer.close();
        Scanner scannerFile = new Scanner(fileName);
        int lineCnt = 0;
        int wordCnt = 0;
        int chaCnt = 0;
        String line;
        while (scannerFile.hasNextLine()){
            line = scannerFile.nextLine();
            chaCnt += line.length();
            lineCnt++;
            Scanner inLine = new Scanner(line);
                while(inLine.hasNext()){
                    wordCnt++;
                    inLine.next();
                }
            }
        scannerFile.close();
        System.out.println("Total characters : "+chaCnt);
        System.out.println("Total words : "+wordCnt);
        System.out.println("Total lines : "+lineCnt);




    }
}
