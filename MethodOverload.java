import java.util.Scanner;
class Area
{

    
	void calculateArea(double radius) 
	{
		double area=Math.PI * radius * radius;
        System.out.println("Area= "+area);
	}

    
    void calculateArea(double length, double width) 
    {
    	double area=length * width;
    	System.out.println("Area= "+area);
    }

    
    void calculateArea(double base, double height, boolean isTriangle) 
    {
    	double area=0.5 * base * height;
    	System.out.println("Area= "+area);
    }
}
public class MethodOverload 
{

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area calculator = new Area();

        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
           calculator.calculateArea(radius);

        } else if (choice == 2) {
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            calculator.calculateArea(length, width);

        } else if (choice == 3) {
            System.out.print("Enter the base of the triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            double height = scanner.nextDouble();
            calculator.calculateArea(base, height, true);

        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
