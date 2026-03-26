package arithmetic;

public class Multiplication implements Operation 
{
    public void calculate(double a,double b)
    {
        double result=a*b;
        System.out.println("Multiplication: "+result);
    }
}

