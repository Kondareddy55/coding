package loop;

public class Design 
{

	public static void main(String[] args) {
		int x,y;
		for(x=1;x<=4;x++)
		{
			for(y=1;y>=4;y--)
			{
				System.out.print((char)(y+64));
		}
			System.out.println();
		}
	}
}
