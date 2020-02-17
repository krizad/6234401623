
public class LetterPrinter {
    public static void main(String[] args) {
        Letter letter = new Letter("Clarissa","Jade");
        letter.addLine("We must find Simon quickly.");
        letter.addLine("He might be in danger.");
        System.out.println(letter.getText());
        
    }
    
}
