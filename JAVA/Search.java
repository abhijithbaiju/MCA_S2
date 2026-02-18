import java.util.Scanner;
public class Search
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt(); 
        int[] a = new int[n];
        
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.print("Enter the element to be search: ");
        int key = sc.nextInt();

        boolean found = false;
        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                System.out.println("Element found at index: " +1);
                found=true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("Element not found");
        }
        sc.close();
    }
}