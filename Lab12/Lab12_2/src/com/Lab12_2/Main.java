package com.Lab12_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File fileName;
        String checkWord;
        ArrayList<String> wordList = new ArrayList<>();
        try {
            fileName = new File("src\\wordlist.txt");
            Scanner scannerFile = new Scanner(fileName);
            while (scannerFile.hasNextLine()){
                wordList.add(scannerFile.next());
            }
            scannerFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.print("Enter a sentence: ");
        Scanner scannerUser = new Scanner(System.in);
        String sentence = scannerUser.nextLine();
        System.out.println("Words not contained : ");
        Scanner scannerSentence = new Scanner(sentence);
        while (scannerSentence.hasNext()){
            checkWord = scannerSentence.next();
            if (wordList.contains(checkWord)){continue;}
            else if (!wordList.contains(checkWord)){
                System.out.println(checkWord);}
            else{System.out.println("N/A");}
        }

    }
}
