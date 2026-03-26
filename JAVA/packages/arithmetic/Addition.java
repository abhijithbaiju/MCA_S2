package arithmetic;

public class Addition implements Operation
{
    public void calculate(double a,double b)
    {
        double result=a+b;
        System.out.println("Addition: "+result);
    }
}

