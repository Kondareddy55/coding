package loop;
import java.util.Scanner;
public class Stars {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int n=sc.nextInt(),odd=1; 
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=odd;j++)
			{
				for(int k=1;k<=j;k++)
				System.out.print(k+" ");
			}
			System.out.println();
			odd=odd+2;
		}
		

	}

}
