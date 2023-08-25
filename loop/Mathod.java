package loop;

public class Mathod {

	public static void main(String[] args) 
	{
	Demo d=new Demo();
	d.calarmstrong();
	}
	}
	class Demo
	{
		int n=153,t1=n,t2=n,count=0;
		public void calarmstrong()
		{	
			int r=0,x=0,sum=0;
		for(x=n;x>0;x/=10) {
			count++;
		}
		for(;t1>0;t1/=10)
		{
	       r=t1%10;
	       x= (int)(Math.pow(r, count));
	       sum=sum+x;
		}
	       if(sum==t2)
	       {
		System.out.println("armstrong");
		}
		else
			System.out.println("not armstrong");
	}
	}

