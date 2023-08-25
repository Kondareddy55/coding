package loop;

public class First {

	public static void main(String[] args) {
		int n,r=0,a=9;
		for(n=1754;n>0;n/=10)
		{r=n%10;
		if(r<=a)
		{
			a=r;
		}
		}
	System.out.println(a);

	}

}
