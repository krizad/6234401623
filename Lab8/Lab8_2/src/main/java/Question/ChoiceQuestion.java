package Question;

import java.util.ArrayList;

class ChoiceQuestion extends Question {
    private ArrayList<String> choices;
    private static int indexArrayCounter = 0;
    public ChoiceQuestion(String text){
        choices = new ArrayList<>();
        choices.add(indexArrayCounter++,text);
    }
    public void addChoice(String choice, boolean correct){
        this.choices.add(indexArrayCounter++,choice);
        if(correct){super.setAnswer(choice);}
    }
    @Override
    public void display(){
        for(int i = 0;i<choices.size();i++){
            if(i>0){System.out.println(i+": "+choices.get(i));}
            else{System.out.println(choices.get(i));}
        }
    }
    @Override
    public boolean checkAnswer(String response){
        return choices.get(Integer.parseInt(response)).equals(super.getAnswer());
    }
}
