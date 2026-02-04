import java.util.Arrays;
import java.util.Scanner;
class Sort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        char[] chars=s.toCharArray();
        Arrays.sort(chars);
        String sorted=new String(chars);
        System.out.println("Orginal String: "+s);
        System.out.println("Sorted String: "+sorted);
        sc.close();
    }
}