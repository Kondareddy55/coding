package loop;

public class Tech {

	public static void main(String[] args) {
		int x, d=0,p=1,div=0,sq=0,rem=0,sum2=0,sum1=0,count=0;
				int start=1,end=10000;
				for(;start<=end;start++)
				{
					d=0;p=1;
					for(x=start;x>0;x/=10)
						d++;
						if(d%2==0)
						{
							d=d/2;
							for(;d>0;d--)
							{
								p=p*10;
							}
							rem=start%p;
							div=start/p;
							sum1=rem+div;
							sq=sum1*sum1;
							if(sq==start)
							{
								count++;
								sum2=sum2+start;
								System.out.println(sum2);
								System.err.println(start);
						}
				}
	}
				System.out.println(count);
	}
}
						
			
				

