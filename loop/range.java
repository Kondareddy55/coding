package loop;

public class range {

	public static void main(String[] args)
	{
		lion obj=new lion();
		String s="";
		for (int x=1;x<=5;x++)
		{
			
			System.out.print(obj.calpattern(x,s));
			System.out.println();
		}
	}
}
class lion
{
	public String calpattern(int x,String s)
	{
		{
			for(int y=1;y<=x;y++)
			{
				s=s+"*";
			}
			return s;
		}
	}
	}



	



