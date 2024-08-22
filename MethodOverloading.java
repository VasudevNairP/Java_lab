import java.util.Scanner;

public class MethodOverloading {

    
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    
    public double calculateArea(double length, double width) {
        return length * width;
    }

    
    public double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MethodOverloading calculator = new MethodOverloading();

        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            double circleArea = calculator.calculateArea(radius);
            System.out.println("The area of the circle is: " + circleArea);

        } else if (choice == 2) {
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            double rectangleArea = calculator.calculateArea(length, width);
            System.out.println("The area of the rectangle is: " + rectangleArea);

        } else if (choice == 3) {
            System.out.print("Enter the base of the triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            double height = scanner.nextDouble();
            double triangleArea = calculator.calculateArea(base, height, true);
            System.out.println("The area of the triangle is: " + triangleArea);

        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}