import java.util.Scanner;

class Publishers
{
    String name;

    Publishers(String name)
    {
        this.name = name;
    }
}

class Book extends Publishers
{
    String title;
    String author;

    Book(String name,String title,String author)
    {
        super(name);
        this.title = title;
        this.author = author;
    }

    void display() {}
}

class Literature extends Book
{
    Literature(String name,String title,String author)
    {
        super(name,title,author);
    }

    void display()
    {
        System.out.println("Category: Literature");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + name);
        System.out.println("- - - - - - - - - - - -");
    }
}

class Fiction extends Book
{
    Fiction(String name,String title,String author)
    {
        super(name,title,author);
    }

    void display()
    {
        System.out.println("Category: Fiction");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + name);
        System.out.println("- - - - - - - - - - - -");
    }
}

public class Publisher
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number of Books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] b = new Book[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("\n1. Literature  2.Fiction");
            System.out.print("Enter Category: ");
            int choice=sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Title: ");
            String title=sc.nextLine();

            System.out.print("Enter Author: ");
            String author=sc.nextLine();

            System.out.print("Enter Publisher: ");
            String name=sc.nextLine();

            if(choice==1)
            {
                b[i] = new Literature(name,title,author);
            }
            else if(choice == 2)
            {
                b[i] = new Fiction(name,title,author);
            }
            else
            {
                System.out.println("Invalid Choice");
                i--;
            }
        }

        System.out.println("\n------ Book Details ------");

        for(int i=0;i<n;i++)
        {
            b[i].display();
        }

        sc.close();
    }
}