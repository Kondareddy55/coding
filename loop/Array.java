package loop;

public class Array {

	public static void main(String[] args) {
	int a[]=new int[] {10,20,30,40,50,60,70};
	int b[]=new int[a.length];
		int x,temp=0;
		for(x=0;x<a.length;x++)
		{
		b[temp]=a[x];
		temp++;
		} 
		  for( temp=0;temp<=(a.length-1)/2;temp++)
			{

			System.out.print(b[temp]+" ");
			}
			for(temp=b.length-1;temp>=(((b.length-1)/2))+1;temp--)
			{
			System.out.print(b[temp]+" ");			
		}	
	}
}


