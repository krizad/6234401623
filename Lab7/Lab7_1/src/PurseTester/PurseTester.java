
package PurseTester;

public class PurseTester {

    public static void main(String[] args) {
        //add and reverse
        System.out.println("---Reverse test---");
        Purse a = new Purse();
        a.addCoin("Quarter");
        a.addCoin("Dime");
        a.addCoin("Nickel");
        a.addCoin("Dime");
        System.out.println(a.toString());
        a.reverse();
        System.out.println(a.toString());
       
        Purse b = new Purse();
        b.addCoin("Dime");
        b.addCoin("Nickel");
        //transfer
        System.out.println("---Transfer test---");
        System.out.println("--Before transfer--");
        System.out.println(a.toString());
        System.out.println(b.toString());
        a.transfer(b);
        System.out.println("--After transfer--");
        System.out.println(a.toString());
        System.out.println(b.toString());
        //sameContents
        System.out.println("---sameContents test---");
        a.addCoin("Quarter");
        a.addCoin("Dime");
        a.addCoin("Nickel");
        a.addCoin("Dime");
        Purse c = new Purse();
        c.addCoin("Nickel");
        c.addCoin("Dime");
        c.addCoin("Dime");
        c.addCoin("Quarter");
        System.out.println(a.toString());
        System.out.println(c.toString());
        System.out.println("Same contents : "+a.sameContents(c));
        Purse f = new Purse();
        f.addCoin("Nickel");
        f.addCoin("Dime");
        f.addCoin("Dime");
        f.addCoin("Quarter");
        System.out.println(c.toString());
        System.out.println(f.toString());
        System.out.println("Same contents : "+c.sameContents(f));
        //sameCoin
        System.out.println("---sameCoin test---");
        Purse d = new Purse();
        d.addCoin("Quarter");
        d.addCoin("Dime");
        d.addCoin("Nickel");
        d.addCoin("Dime");
        Purse e = new Purse();
        e.addCoin("Nickel");
        e.addCoin("Dime");
        e.addCoin("Dime");
        e.addCoin("Quarter");
        System.out.println(d.toString());
        System.out.println(e.toString());
        System.out.println("Same coin : "+d.sameCoins(e));
        d.addCoin("Nickel");
        d.addCoin("Dime");
        e.addCoin("Dime");
        e.addCoin("Nickel");
        System.out.println(d.toString());
        System.out.println(e.toString());
        System.out.println("Same coin : "+d.sameCoins(e));
        d.addCoin("Dime");
        e.addCoin("Nickel");
        System.out.println(d.toString());
        System.out.println(e.toString());
        System.out.println("Same coin : "+d.sameCoins(e));

        
        
    }
    
}
