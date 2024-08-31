import java.util.Scanner;

class Employee
{
	String name, address;
	long ph;
	int age;
	float salary;
	Employee(String name1, String address1,long ph1,int age1,float salary1)
	{
		name=name1;
		address=address1;
		age=age1;
		ph=ph1;
		salary=salary1;
	}
	void printEmployee()
	{
		System.out.println("Employee details are:");
		System.out.println("Name:"+name);
		System.out.println("Age"+age);
		System.out.println("Phone Number:"+ph);
		System.out.println("Address"+address);
	}
	void printSalary()
	{
		System.out.println("Salary of "+name+" is: "+salary);
	}
}

class Manager extends Employee
{
	String Dep;
	Manager(String name1, String address1,long ph1,int age1,float salary1,String Dep1)
	{
		super(name1,address1,ph1,age1,salary1);
		Dep=Dep1;
	}
	void printDepartment() 
	{
		System.out.println(" Department:"+Dep);
	}
}
class Officer extends Employee
{
	String Spec;
	Officer(String name1, String address1,long ph1,int age1,float salary1,String Spec1)
	{
		super(name1,address1,ph1,age1,salary1);
		Spec=Spec1;
	}
	void printSpecialization() 
	{
		System.out.println("Specialization:"+Spec);
	}
}
public class HierarchialInheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Name, dep, spec,Address;
		int Age;
		float Salary;
		long Ph;
		
		System.out.println("Enter Officer details:");
		System.out.print("Enter Officer name:");
			Name = sc.nextLine();
		System.out.print("Enter Officer Age:");
			Age = sc.nextInt();
		System.out.print("Enter Officer Phno:");
			Ph = sc.nextLong();
		System.out.print("Enter Officer Address:");
			Address = sc.next();
		System.out.print("Enter Officer Salary:");
			Salary = sc.nextFloat();
		System.out.println("Enter Officer Specilization:");
			spec = sc.next();
		
		System.out.println("Enter Manager details:");
		System.out.print("Enter Manager name:");
			Name = sc.next();
		System.out.print("Enter Manager Age:");
			Age = sc.nextInt();
		System.out.print("Enter Manager Phno:");
			Ph = sc.nextLong();
		System.out.print("Enter Manager Address:");
			Address = sc.next();
		System.out.print("Enter Manager Salary:");
			Salary = sc.nextFloat();
		System.out.print("Enter Manager Department:");
			dep = sc.next();
		Officer off=new Officer(Name,Address, Ph, Age, Salary, spec);
		Manager mn=new Manager(Name,Address, Ph, Age, Salary, dep);
		off.printEmployee();
		off.printSalary();
		off.printSpecialization();
		mn.printEmployee();
		mn.printSalary();
		mn.printDepartment();
		sc.close();
	}

}
