
package TimeIntervalTester;

import java.util.Scanner;

public class TimeIntervalTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start time: ");
        int start = sc.nextInt();
        System.out.print("Enter end time: ");
        int end = sc.nextInt();
        TimeInterval time = new TimeInterval(start,end);
        System.out.println(time.getHours()+time.getMinutes());
    }
    
}
