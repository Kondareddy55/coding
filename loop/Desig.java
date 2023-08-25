package loop;

public class Desig {

	public static void main(String[] args) {
		int n=4;
		for(int x=1;x<=n;x++)
		{
			for(int z=1;z<=x-1;z++)
			{
				System.out.print(" ");
			}
			for(int y=1;y<=x;y++) {
					System.out.print("* ");
				}
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=x-1;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=x;k++) {
						System.out.print("* ");
				}
			System.out.println(" ");
		}
	}
	}
}
	



