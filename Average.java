import java.util.Scanner;
class Negative extends Exception
{
    public Negative(String message)
    {
        super(message);
    }
}
public class Average
{
    static double findAvg(int n,Scanner sc) throws Negative
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter number: "+ i + ":");
            int num=sc.nextInt();
            if(num<0)
            {
               throw new Negative("Negative number entered: "+ num);
            }
            sum += num;
        }
        return(double) sum/n;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
           System.out.print("Enter the value of N: ");
           int n=sc.nextInt();
           double avg=findAvg(n,sc);
           System.out.println("Average="+avg);
        }
        catch(Negative e)
        {
          System.out.println("Exception: "+ e.getMessage());
        }
        catch(Exception e)
        {
          System.out.println("Invalid Input!");
        }
        sc.close();
    }
}