import java.util.Scanner;
public class OccuranceOfChar 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check the occurance of given character :");
		String str=sc.nextLine().toLowerCase();
		System.out.println("Enter the character to be searched :");
		String ch=sc.nextLine().toLowerCase();
		int count=0;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)==ch.charAt(0))
			{
				count++;
			}	
		}
    System.out.println("The occurance of character"+ch+ "is"+count);	
  }
}
