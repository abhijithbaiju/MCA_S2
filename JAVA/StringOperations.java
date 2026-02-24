import java.util.Arrays;
import java.util.Scanner;

public class StringOperations 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string to check palindrome: ");
        String str = sc.nextLine();
        if (isPalindrome(str)) 
        {
            System.out.println("The string is a Palindrome.");
        } 
        else 
        {
            System.out.println("The string is NOT a Palindrome.");
        }

        
        System.out.print("\nEnter number of names to sort: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);

        System.out.println("\nNames in Ascending Order:");
        for (String name : names) 
        {
            System.out.println(name);
        }

        sc.close();
    }

    static boolean isPalindrome(String str) 
    {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reversed += str.charAt(i);
        }
        return str.equalsIgnoreCase(reversed);
    }
}