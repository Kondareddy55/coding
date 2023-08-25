package loop;

public class N76 {

	public static void main(String[] args) 
	{
		int n=12,sq1=0,s=0,r1=0,sq2=0,r2=0,s2=0;
		sq1=n*n;
		System.out.println(sq1);
		while(n!=0)
		{
		r1=n%10;
		s=s*10+r1;
		n/=10;
		}
		System.out.println(s);
		sq2=s*s;
		System.out.println(sq2);
		while(sq2!=0)
		{
			r2=sq2%10;
			s2=s2*10+r2;
			sq2/=10;
		}
		System.out.println(s2);
		if(sq1==s2)
			System.out.println("ailen");
		else
			System.out.println("not ailen");
	}
	}

