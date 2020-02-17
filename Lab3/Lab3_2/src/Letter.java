
public class Letter {
    private String fromName; private String toName;private String text;
    public Letter(String from, String to){
        fromName = from;
        toName = to;
        text = "";
    }
    public void addLine(String line){
        text += line + "\n";
    }
    public String getText(){
        return "Dear "+toName+":"+"\n"+"\n"+text+"\n"+"Sincerely,"+"\n"+"\n"+fromName;
        
    }
    
}
