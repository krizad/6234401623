
public class expo extends Taylor{
    public expo(int k,double x){
        setIter(k);
        setValue(x);
    }
    @Override
    public double getApprox(){
        double approx=0;
        for(int n = 0;n<=super.getIter();n++)
            approx+= (Math.pow(getValue(),n))/(factorial(n));
        return approx;
    }
    @Override
    public void printValue(){
        double fromMath = Math.exp(getValue());
        System.out.println("Value from Math.exp() is "+fromMath);
        System.out.println("Approximated value is "+getApprox());
    }
}
