package Question;
public class NumericQuestion extends Question {
    public NumericQuestion(String text){
        super(text);
    }
    @Override
    public boolean checkAnswer(String response){
        double ans = Double.valueOf(super.getAnswer());
        double resp = Double.valueOf(response);
        return Math.abs(ans-resp)<=0.01;
    }
}
