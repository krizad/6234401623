/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CannonBallTester.CannonBallTester;

import java.text.DecimalFormat;


public class CannonBall {
    private double initV; 
    private double simS; 
    private double simT;
    public static final double g = 9.81;
    DecimalFormat df = new DecimalFormat("#.###");
public CannonBall(double v){initV = v;}
public void simulatedFlight(){
    
    double ds;
    double dt = 0.01;
    double v = initV;
    while (v >= 0){
    ds = v*dt;
    simS += ds;
    v = v - g*dt;
    simT++;
        while (simT%100 == 0){
            System.out.println("Distance on "+(int)simT/100+" sec: "+df.format(simS));
            break;
    }
    }
}
public double calculusFlight(double t){
    double distance = -0.5*g*t*t+initV*t;
    return distance;
}
public double getSimulatedTime(){return simT/100.0;}
public double getSimulatedDistance(){return simS;}
}
