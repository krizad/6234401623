public abstract class Taylor {
    private int k;
    private double x;
    public int factorial(int n){
        int factCal=1;
        for(int i= 1;i<=n;i++)
            factCal*=i;
        return factCal;
    }
    public void setIter(int k){
        this.k = k;
    }
    public int getIter(){
        return k;
    }
    public void setValue(double x){
        this.x = x;   
    }
    public double getValue(){
        return x;
    }
    public abstract void printValue();
    public abstract double getApprox();
}
