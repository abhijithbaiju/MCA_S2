import arithmetic.*;
import java.util.Scanner;

public class TestArithmetic 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter first number: ");
      double a=sc.nextDouble();  
      System.out.print("Enter second number: ");
      double b=sc.nextDouble(); 

      Addition add=new Addition();
      Subtraction sub=new Subtraction();
      Multiplication mul=new Multiplication();
      Division div=new Division();

      add.calculate(a,b);
      sub.calculate(a,b);
      mul.calculate(a,b);
      div.calculate(a,b);

    }


    
}
