
package PurseTester;

import java.util.ArrayList;


public class Purse {
    ArrayList<String>purse = new ArrayList<>();
   public void addCoin(String coinName){
       purse.add(coinName);
   }
    @Override
   public String toString(){
       return "Purse"+purse.toString();
   }
   public ArrayList<String> reverse(){
       ArrayList<String> purseReverse = new ArrayList<>();
       for(int i = 1 ; i<=purse.size(); i++){purseReverse.add(purse.get(purse.size()-i));}
       purse = purseReverse;
   return purse;
   }
   public void transfer(Purse other){
        Purse newPurse = other;
        for(int i = 0 ; i<purse.size(); i++){newPurse.addCoin(purse.get(i));}
        for(int i = purse.size() ; i>0; i--){purse.remove(0);}
   }
   public boolean sameContents(Purse other){
    return purse.equals(other.purse); 
   }
    public boolean sameCoins(Purse other){
        boolean sameCoinTest = true;
        ArrayList<String> newPurse = (ArrayList<String>) other.purse.clone();
        for (String coin: purse){
            for(String coinTest: newPurse){if(coin.equals(coinTest)){newPurse.remove(coin);sameCoinTest = true;break;}else{sameCoinTest = false;}}
        }
        return sameCoinTest;
    }
   
}

