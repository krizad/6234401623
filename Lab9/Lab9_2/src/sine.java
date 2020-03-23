
public class sine extends Taylor {
    public sine(int k,double x){
        setIter(k);
        setValue(x);
    }
    @Override
    public double getApprox(){
        double approx=0;
        for(int n = 0;n<=super.getIter();n++)
            approx+= (Math.pow(-1,n)*Math.pow(getValue(),2*n+1))/(factorial(2*n+1));
        return approx;
    }
    @Override
    public void printValue(){
        double fromMath = Math.sin(getValue());
        System.out.println("Value from Math.sin() is "+fromMath);
        System.out.println("Approximated value is "+getApprox());
    }
}
