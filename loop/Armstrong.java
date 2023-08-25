package loop;
public class Armstrong {

	public static void main(String[] args) {
		int x,y,sum=0,count=0,rem=0;
		for(x=1;x<=500;x++)
		{	
			count=0;sum=0;
			test t=new test();
			t.x=153;
		}
	}	
		}
				class test
				{
					int y,x,count=0;
					public void calarm()
					{
					for(y=x;y>0;y/=10)
					{
				
				count++;
			}
					}
			y=x;
			for(;y>0;y/=10)
			{
				rem=y%10;
				sum=(int)(sum+Math.pow(rem,count));	
			}
			if(sum==x)
				System.out.println(sum);
		
}



	

		
	

		
	
						
			

