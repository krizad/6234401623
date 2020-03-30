package lab10_1;
public class Subject implements Evaluation {
    private String subjName;
    private int[] score;
    public Subject(String subjName,int[] score){
        this.subjName = subjName;
        this.score = score;
    }
    @Override
    public double evaluate() {
        double totalScore = 0;
        for (int s : score){
            totalScore+=s;
        }
        double avgScore = totalScore/(double)score.length;
        return avgScore;
    }

    @Override
    public char grade(double avgScore) {
        if (avgScore>=70){return 'P';}
        else {return 'F';}
    }
    @Override
    public String toString(){
        return subjName;
    }
    
}
