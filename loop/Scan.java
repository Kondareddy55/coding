package loop;
import java.util.Scanner;
public class Scan {

	public static void main(String[] args)
	{
		int a;
		double b;
		char c;
		String s;
		System.out.println("enter int,double,char,String");
		Scanner sc=new Scanner(System.in); 
		a=sc.nextInt();
		b=sc.nextDouble();
		c=sc.next().charAt(0);
		s=sc.next();
		System.out.println("a="+a+"b="+b+"c="+c+"s="+s);
		
		
	}

}
