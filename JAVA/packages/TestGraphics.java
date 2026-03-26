import graphics.*;
import java.util.Scanner;

public class TestGraphics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();
        Rectangle rect = new Rectangle(l, b);

        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        Triangle tri = new Triangle(base, height);

        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        Square sq = new Square(side);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        Circle cir = new Circle(r);

        System.out.println("\n--- Areas ---");
        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Triangle Area: " + tri.area());
        System.out.println("Square Area: " + sq.area());
        System.out.println("Circle Area: " + cir.area());

        sc.close();
    }
}
