package loop;

public class evena {

	public static void main(String[] args) {
		int a[]=new int[] {12,1,5,4,6,7};
		int b[]=new int[a.length];
		int x,temp=0;
		if(a.length%2==0)
		{
			for(x=0;x<a.length;x++)
			{
				if(x%2==0)
				{
					b[temp]=a[x];
							temp++;
				}
			}
			for(x=0;x<a.length;x++)
			{
				if(x%2==1)
				{
					b[temp]=a[x];
				temp++;
			}
			}
			for(x=0;x<a.length;x++)
			System.out.println(b[x]);
			}
		else
		System.out.println("we must have even size");
		}
		
	}


