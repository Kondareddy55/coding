package loop;

public class Conut {

	public static void main(String[] args) {
		int num=21421,rem=0,sum=0;
		for(;num>0;num/=10)
		{
			rem=num%10;
			sum=sum+rem;
		}
		System.out.println(sum);

	}

}
