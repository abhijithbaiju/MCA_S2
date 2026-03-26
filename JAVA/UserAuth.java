import java.util.Scanner;

public class UserAuth 
{
     static void authenticate(String user, String pass, String storedUser, String storedPass) throws InvalidLoginException 
    {

        if (!user.equals(storedUser) || !pass.equals(storedPass)) 
        {
            throw new InvalidLoginException("Invalid Username or Password!");
        } 
        else 
        {
            System.out.println("Login Successful!");
        }
    }

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Create Account ===");
        System.out.print("Create username: ");
        String newUser = sc.nextLine();

        System.out.print("Create password: ");
        String newPass = sc.nextLine();

        System.out.println("\n=== Login ===");
        System.out.print("Enter username: ");
        String user = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        try 
        {
            authenticate(user, pass, newUser, newPass);
        } 
        catch (InvalidLoginException e) 
        {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}