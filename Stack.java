import java.util.ArrayList;
import java.util.Scanner;

class Stackinput<T>
{
    private ArrayList<T> list=new ArrayList<>();
    public void push(T item)
    {
        list.add(item);
        System.out.println(item + "Pushed to stack");
    }
    public T pop()
    {
        if(list.isEmpty())
        {
            System.out.println("Stack is empty");
            return null;
        }
        return list.remove(list.size() - 1);
    }
    public void display()
    {
        System.out.println("Stack: " + list);
    }
}
public class Stack
{
    public static void main(String[] args)
    {
           Scanner sc = new Scanner(System .in);
           Stackinput<Integer> stack = new Stackinput<>();

           int choice;
           do
           {
             System.out.println("\n1.Push");
             System.out.println("2.Pop");
             System.out.println("3.Display");
             System.out.println("4.Exit");
             System.out.println("Enter your choice: ");
             choice=sc.nextInt();

             switch(choice)
             {
                case 1:
                       System.out.print("Enter elements: ");
                       int val=sc.nextInt();
                       stack.push(val);
                       break;
                case 2:
                       Integer popped=stack.pop();
                       if(popped !=null)
                       {
                         System.out.println("Popped: " + popped);
                       }
                       break;
                case 3:
                      stack.display();
                      break;
                case 4:
                       System.out.println("Exit");
                       break;
                default:
                        System.out.println("Invalid choice!");
             }
            
           }
        while(choice !=4);
    }   
}