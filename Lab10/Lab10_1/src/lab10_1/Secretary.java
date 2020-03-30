package lab10_1;
public class Secretary extends Employee implements Evaluation {
    private int typingSpeed;
    private int score[];
    public Secretary(String name,int salary,int[] score,int typingSpeed){
        super(name,salary);
        this.score = score;
        this.typingSpeed = typingSpeed;
    }
    @Override
    public double evaluate() {
        double totalScore = 0;
        for (int s : score){
            totalScore+=s;
        }
        return totalScore;
    }

    @Override
    public char grade(double totalScore) {
        if (totalScore>=90){super.setSalary(18000);return 'P';}
        else {return 'F';}
    }
    
}
