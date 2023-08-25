package loop;

public class Evil {

	public static void main(String[] args) {
		int x=1,y,sum1=0,s=0,r=0,count=0;
		for(x=1;x<=9;x++)
		{
			sum1=0;
			s=x*x;
			for(y=s;y>0;y/=10)
			{
			r=y%10;
			sum1=sum1+r;
			}
		if(sum1==x)
		{
			count++;
			System.out.println(sum1+""+count);
		}
		}
		}
	}

