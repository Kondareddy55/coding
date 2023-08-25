package loop;

public class arraya {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5};
		int b[]=new int[a.length];
		int x,temp=0;
		for(x=0;x<a.length;x++)
		{
			if(x==0)
			b[temp++]=a[x]+a[x+1];
			else if(x==a.length-1)
				b[temp++]=a[x-1]+a[x];
			else
				b[temp++]=a[x-1]+a[x+1];
		}
	for(x=0;x<a.length;x++)
	{
		System.out.println(b[x]);
	}
	}
}//


