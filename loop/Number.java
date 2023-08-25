package loop;

public class Number {

	public static void main(String[] args) {
	int x,y,s=0,p=1,r=0,count=0,sum=0;
	for(x=1;x<=140;x++)
	{
		p=1;s=0;
		for(y=x;y>0;y/=10)
		{
		r=y%10;
		s=s+r;
		p=p*r;
	}
	if(s==p)
	{
		count++;
		sum=sum+x;
		System.out.println(x+" "+count+" "+sum);	}

	}
	}
}

