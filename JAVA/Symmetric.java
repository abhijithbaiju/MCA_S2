import java.util.Scanner;

class Symmetric
{
    int r,c;
    int [][]a;

    void readMatrix()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        r=ob.nextInt();
        System.out.println("Enter number of columns: ");
        c=ob.nextInt();

        a=new int[r][c];
        System.out.println("Enter the elements of matrix A: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=ob.nextInt();
            }

        }
    }


    void checkSymmetric()
    {
        if(r!=c)
        {
            System.out.println("Matrix is not Square matrix");
            return;
        }
        for(int i=0;i<r;i++)
        {
            for(int j=i+1;j<c;j++)
            {
                if(a[i][j]!=a[j][i])
                {
                    System.out.println("Matrix is not Symmetric");
                    return;
                }
            }
        }
        System.out.println("Matrix is Symmetric");
    }


public static void main(String[] args)
    {
        Symmetric obj=new Symmetric();
        obj.readMatrix();
        obj.checkSymmetric();
    }
}
    