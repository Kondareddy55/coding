package loop;
import java.util.Scanner;
public class Bus 
{
	public static void main(String[] args) 
{
		double km;
		System.out.println("enter  the kilometer");
		Scanner sc=new Scanner(System.in); 
		km=sc.nextDouble();
		int age=23,fee=0,gst=0;
		int Th=123;
		String name="kondareddy";
		if(km<=50)
		{
			fee=200;gst=20;
		}
		else if(km<=60)
		{
			fee=300;gst=30;
		}
		else if(km<=70)
		{
			fee=400;gst=40;
		}
		System.out.println(fee+" "+gst);
		System.out.println(name+" "+age+" "+Th);
}
}
