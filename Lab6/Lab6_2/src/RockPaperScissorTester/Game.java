
package RockPaperScissorTester;

import java.util.Random;
import java.util.Scanner;


public class Game {
    private String userEnter;
    private int computerEnter;

public void play(){
        int computerPoint = 0;
        int userPoint = 0;
    while (computerPoint < userPoint+ 2 && userPoint < computerPoint+2)
    {
        System.out.print("Enter 0 for ROCK, 1 for PAPER, 2 for SCISSORS:");
        Scanner in = new Scanner(System.in);
        userEnter = in.next();
        if ("0".equals(userEnter)){System.out.println("You enter: Rock");}
        else if ("1".equals(userEnter)){System.out.println("You enter: Paper");}
        else if ("2".equals(userEnter)){System.out.println("You enter: Scissors");}
        else {continue;}
        Random ran = new Random();
        computerEnter = ran.nextInt(3);
        switch(computerEnter){
            case 0:System.out.println("Computer: Rock");break;
            case 1:System.out.println("Computer: Paper");break;
            case 2:System.out.println("Computer: Scissors");break;
            }
        if (userEnter.equals(computerEnter+"")){System.out.println("It's a tie.");}
        else if ("0".equals(userEnter) && computerEnter == 1){System.out.println("You lose!");computerPoint++;}
        else if ("0".equals(userEnter) && computerEnter == 2){System.out.println("You win!");userPoint++;}
        else if ("1".equals(userEnter) && computerEnter == 2){System.out.println("You lose!");computerPoint++;}
        else if ("1".equals(userEnter) && computerEnter == 0){System.out.println("You win!");userPoint++;}
        else if ("2".equals(userEnter) && computerEnter == 0){System.out.println("You lose!");computerPoint++;}
        else if ("2".equals(userEnter) && computerEnter == 1){System.out.println("You win!");userPoint++;}
        
    }
        System.out.println("-------------------------------");
        if (computerPoint>userPoint){
            System.out.println("Too bad! You lose.");
            System.out.println(computerPoint);
            System.out.println(userPoint);}
        if (computerPoint<userPoint){
            System.out.println("Congrats! You win.");
            System.out.println(computerPoint);
            System.out.println(userPoint);}
                   
    
}
    
}
