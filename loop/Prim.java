package loop;

public class Prim {
	int x,fact,n=145,r,z,sum;
public int calStrong()
{
	for(x=145;x>0;x/=10)
	{
		fact=1;
		r=n%10;
		for(z=r;z>0;z--)
		{
			fact=fact*z;
		}
		sum=sum+r;	
	}
	return sum;
}
	class Test
	{
		public static void main(String args[])
		{
			Prim p=new Prim();
			p.n=145;
			int x=p.calStrong();
			if(p.n==x)
				System.out.println("strong");
			else
				System.out.println("not strong");		}

}
}

