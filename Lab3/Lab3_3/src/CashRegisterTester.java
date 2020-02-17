
public class CashRegisterTester {

    public static void main(String[] args) {
        CashRegister cash = new CashRegister(7);
        cash.recordPurchase(50);
        cash.recordPurchase(10);
        cash.recordTaxablePurchase(20);
        cash.enterPayment(100);
        System.out.println("Your change is "+cash.giveChange());
    }
    
}
