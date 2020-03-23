
public class cosine extends Taylor {
    public cosine(int k,double x){
        setIter(k);
        setValue(x);
    }
    @Override
    public double getApprox(){
        double approx=0;
        for(int n = 0;n<=super.getIter();n++)
            approx+= (Math.pow(-1,n)*Math.pow(getValue(),2*n))/(factorial(2*n));
        return approx;
    }
    @Override
    public void printValue(){
        double fromMath = Math.cos(getValue());
        System.out.println("Value from Math.cos() is "+fromMath);
        System.out.println("Approximated value is "+getApprox());
    }
}
