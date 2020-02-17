/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CannonBallTester.CannonBallTester;

import java.text.DecimalFormat;

public class CannnonBallTester {
    public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("#.###");
    CannonBall ball = new CannonBall(100);
    ball.simulatedFlight();
    System.out.print("Final distance: "+df.format(ball.getSimulatedDistance()));
    System.out.println("  Total time: "+ball.getSimulatedTime());
    System.out.println("Distance from calculus equation: "+df.format(ball.calculusFlight(ball.getSimulatedTime())));
}    
    
    
}
