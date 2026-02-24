import java.util.Scanner;

public class StringHandlingDemo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuffer sb = new StringBuffer(input);

        System.out.println("Length of the string: " + input.length());
        System.out.println("Capacity of StringBuffer: " + sb.capacity());

  
        sb.reverse();
        String reversedUpper = sb.toString().toUpperCase();
        System.out.println("Reversed and Uppercase String: " + reversedUpper);


        System.out.print("Enter another string to append: ");
        String secondInput = sc.nextLine();

        sb = new StringBuffer(input);
        sb.append(secondInput);

        System.out.println("Final String after Appending: " + sb);
        
        sc.close();
    }
}


