package loop;

public class N766 {

	public static void main(String[] args) {
	int start=1,end=100,d=0,sq=0,p=0,s=0,copy=0;
	for(;start<=end;start++)
	{
		d=0;copy=start;p=1;
	for(;start>0;start/=10)
	{
		d++;	
	}
	start=copy;
	sq=start*start;
	for(;d>0;d--)
	{
		p=p*10;
	}
	s=sq%p;
	if(s==start)
		System.out.println(start);
	}
	}
	}

