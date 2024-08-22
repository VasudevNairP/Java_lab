/*lab work*/
import java.util.Scanner;
class Area
{

    
	void calculateArea(double radius) 
	{
		double area1=Math.PI * radius * radius;
        System.out.println("Area= "+area1);
	}

    
    void calculateArea(double length, double width) 
    {
    	double area2=length * width;
    	System.out.println("Area= "+area2);
    }

    
    void calculateArea(double base, double height, boolean isTriangle) 
    {
    	double area3=0.5 * base * height;
    	System.out.println("Area= "+area3);
    }
}
public class MethodOverload 
{

	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        Area calculator = new Area();
        
        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        calculator.calculateArea(radius);

        
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        calculator.calculateArea(length, width);

        
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        calculator.calculateArea(base, height, true);
        scanner.close(); 
	}
}
