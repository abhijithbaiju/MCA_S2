import java.util.Scanner;

public class Stringdemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Length of the string: " + str.length());

        if(str.length() >= 4)
        {
            System.out.println("Character at second position: " + str.charAt(1));
            System.out.println("Character at fourth position: " + str.charAt(3));
        }
        else
        {
            System.out.println("String length is less than 4 characters");
        }

        System.out.print("Enter start index of the substring: ");
        int start = sc.nextInt();

        if(start < str.length())
        {
            System.out.println("Substring(start index only): " + str.substring(start));
        }
        else
        {
            System.out.println("Invalid index values");
        }

        sc.nextLine(); 

        System.out.print("Enter another string to concatenate: ");
        String str2 = sc.nextLine();

        String concatenated = str.concat(str2);

        System.out.println("Concatenated string: " + concatenated);
        System.out.println("Lowercase String: " + str.toLowerCase());
        System.out.println("Uppercase String: " + str.toUpperCase());

        sc.close();
    }
}
