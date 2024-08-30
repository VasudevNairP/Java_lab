import java.util.Scanner;
class Employee{
	String Name=new String();
	int Age;
	int Phno;
	String Adrs=new String();
	float Salary;
	void  Sal() {
		System.out.println("Salary is :"+Salary);
	}
	void display() {
		System.out.println("Name is :"+Name);
		System.out.println("Age is :"+Age);
		System.out.println("PhoneNo is :"+Phno);
		System.out.println("Address is :"+Adrs);
		}}
	class Manager extends Employee{
		String Dpt=new String();
		void dept() {
			System.out.println("Department is :"+Dpt);
		}
	}
	class Officer extends Employee{
		String special = new String();
		void Spec(){
			System.out.print("\nSpecilization is:"+special);
		}
	}

public class Inhertance {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Officer off = new Officer();
		Manager mn = new Manager();
		System.out.println("Enter Officer details:");
		System.out.print("Enter Officer name:");
		off.Name = sc.nextLine();
		System.out.print("Enter Officer Age:");
		off.Age = sc.nextInt();
		System.out.print("Enter Officer Phno:");
		off.Phno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Officer Address:");
		off.Adrs = sc.nextLine();
		System.out.print("Enter Officer Salary:");
		off.Salary = sc.nextFloat();
		sc.nextLine();
		System.out.print("Enter Officer Specilization:");
		off.special = sc.nextLine();
		
		System.out.println("Enter Manager Details:");
		System.out.print("Enter Manager Name:");
		mn.Name = sc.nextLine();
		System.out.print("Enter Manager age:");
		mn.Age = sc.nextInt();
		System.out.print("Enter Manager phno:");
		mn.Phno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Manager Address:");
		mn.Adrs = sc.nextLine();
		System.out.print("Enter Manager salary:");
		mn.Salary = sc.nextFloat();
		sc.nextLine();
		System.out.print("Enter Manager Department:");
		mn.Dpt = sc.nextLine();
		
		System.out.println("Officer Details:");
		off.display();
		off.Sal();
		off.Spec();
		System.out.println("Manager Details:");
		mn.display();
		mn.Sal();
		mn.dept();
		sc.close();
		
	}

}


