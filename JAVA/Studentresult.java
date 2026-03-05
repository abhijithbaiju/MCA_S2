import java.util.Scanner;
 class Students
 {
    int rno,score;

    void getStudent(int r,int a)
    {
        rno=r;
        score=a;
    }
 }

 class Sports
 {
    int sportsScore;
     void getSports(int s)
     {
        sportsScore=s;
     }
 }

 class Result extends Students
 {
    int sportsScore;

    void getSports(int s)
    {
        sportsScore=s;
    }

    void display()
    {
        System.out.println("Roll Number: "+ rno);
        System.out.println("Academic Score: "+ score);
        System.out.println("Sports Score: "+ sportsScore);
    }
 }

 public class Studentresult
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Result r=new Result();

        System.out.print("Enter the Roll Number: ");
        int roll=sc.nextInt();

        System.out.print("Enter the Academic Score: ");
        int acad=sc.nextInt();

        System.out.print("Enter the Sports Score: ");
        int sport=sc.nextInt();

        r.getStudent(roll,acad);
        r.getSports(sport);

        System.out.println("\n ----STUDENT RESULT----");
        r.display();

        sc.close();
    }
 }
 