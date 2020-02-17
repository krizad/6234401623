
package TimeIntervalTester;

public class TimeInterval {
    private int initTime;
    private int finalTime;
public TimeInterval(int start,int end){
    initTime = start;
    finalTime = end;
    
    initTime = initTime/100*60 + initTime%100;
    finalTime = finalTime/100*60 + finalTime%100;
}
public String getHours(){
    int hour = finalTime - initTime;
    return (hour/60) + (" hours ");
}
public String getMinutes(){
    int hour = finalTime - initTime;
    return hour%60+" minutes ";
}
}
