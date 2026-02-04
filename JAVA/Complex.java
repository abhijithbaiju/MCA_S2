import java.util.Scanner;

class Complex
{
    int real;
    int img;
    Complex(int r,int i)
    {
        real=r;
        img=i;
    }
    Complex add(Complex c)
    {
        return new Complex(this.real+c.real,this.img+c.img);
    }
    void display()
    {
        if(img>=0)
        {
            System.out.println(real+"+"+img+"i");
        }
        else
        {
            System.out.println(real+"-"+(-img)+"i");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the first number: ");
        int r1=sc.nextInt();
        System.out.print("Enter imaginary of first number: ");
        int i1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int r2=sc.nextInt();
        System.out.print("Enter the imaginary of second number: ");
        int i2=sc.nextInt();
        Complex c1=new Complex(r1,i1);
        Complex c2=new Complex(r2,i2);
        Complex sum=c1.add(c2);
        System.out.print("Sum= ");
        sum.display();
        sc.close();
    }
}