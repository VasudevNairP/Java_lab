/*lab work*/
import java.util.Scanner;
public class MatrixMultiplication
{
	public static void main(String[] args)
	{
		int a, b, c, i, j, k;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter row of 1st matrix");
			a=input.nextInt();
		System.out.println("Enter column of 1st and row of 2nd matrix");
			b=input.nextInt();
		System.out.println("Enter column of 2nd matrix");
			c=input.nextInt();
		int p[][]=new int[a][b];
		int q[][]=new int[b][c];
		int r[][]=new int[a][c];
		System.out.println("Enter elements of 1st matrix \n");
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				p[i][j]=input.nextInt();
			}
		}
		System.out.println("Enter elements of 2nd matrix \n");
		for(i=0;i<b;i++)
		{
			for(j=0;j<c;j++)
			{
				q[i][j]=input.nextInt();
			}
		}
		for(i=0;i<a;i++)
		{
			for(j=0;j<c;j++)
			{
				for(k=0;k<b;k++)
				{
					r[i][j]+=p[i][k]*q[k][j];
				}
			}
		}
		System.out.println("result is:");
		for(i=0;i<a;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(r[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}
