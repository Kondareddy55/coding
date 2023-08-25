package loop;

public class Sum {

	public static void main(String[] args) {
		int n=23134,min=9,rem=0;
		for(;n>0;n/=10)
		{
			rem=n%10;
		if(rem<min)
		{
			min=rem;
			}
	}
		System.out.println(min);
	}		
}




