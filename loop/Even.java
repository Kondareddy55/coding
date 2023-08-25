package loop;

public class Even {

	public static void main(String[] args) {
		int n=1754,r=0;
		for(n=4571;n>0;n/=10)
		{
			r=n%10;
		if(r%2==0)
		{
		r=r+2;
		}
	else
	{
		r=r+1;
	}
	System.out.print(r);
}
	}
}
