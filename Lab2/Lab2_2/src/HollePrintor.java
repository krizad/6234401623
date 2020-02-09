/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usci
 */
public class HollePrintor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String text;
        text = "Hello, World!";
        text = text.replace('e', '*');
        text = text.replace('o', 'e');
        text = text.replace('*', 'o');
        System.out.println(text);
        
    }
    
}
