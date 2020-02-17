
public class CashRegister {
    private double tax;
    private double totalPurchase;
    private double totalPay;
    private double totalTax;
    private double TaxPurchase;
    public CashRegister(double initTax){
        tax = initTax;
    }
    public void recordPurchase(double amout){
        totalPurchase += amout;
    }
    public void recordTaxablePurchase(double amout){
        TaxPurchase = (amout*tax)*0.01;
        totalPurchase += (amout+TaxPurchase);
        totalTax += TaxPurchase;
    }
    public void enterPayment(double amout){
        totalPay += amout;
    }
    public double giveChange(){
        return totalPay - totalPurchase;
    }
    public double getTotalTax(){
        return totalTax;
    }
}
