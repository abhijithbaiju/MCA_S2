package arithmetic;

public class Subtraction implements Operation 
{
    public void calculate(double a,double b)
    {
        double result=a-b;
        System.out.println("Subtraction: "+result);
    }
}
