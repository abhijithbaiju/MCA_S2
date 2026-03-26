package arithmetic;

public class Division 
{
    public void calculate(double a, double b) 
    {
        if (b == 0) 
        {
            System.out.println("Division: Cannot divide by zero");
        }
         else 
        {
            System.out.println("Division: " + (a / b));
        }
    }
}