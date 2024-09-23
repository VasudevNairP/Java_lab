import java.util.Scanner;
interface Human
{
	void learn(String str);
	void work();
	final int jobid=1050;
}
interface Recruitment
{
	void screening(int score);
}
class Programmer implements Human , Recruitment
{
	public void learn(String str)
	{
		System.out.println("My trained area : " + str);
	}
	public void work() 
	{
		System.out.println("Selected to the Role Development");
	}
	public void screening(int score) 
	{
		System.out.println("Test Score : "+ score);
	}
}
public class Interface
{

	public static void main(String args[]) 
	{
		Programmer trainee=new Programmer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your trained area");
			String str=sc.nextLine();
		System.out.println("Enter Test Score");
			int score=sc.nextInt();
		System.out.println("----ABOUT MY PLACEMENT----");
			trainee.learn(str);
			trainee.screening(score);
			trainee.work();
		System.out.println("My Job's ID is : "+trainee.jobid);
	}
}
