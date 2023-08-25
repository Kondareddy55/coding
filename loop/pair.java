package loop;

public class pair {

	public static void main(String[] args) {
		int a[]=new int[] {2,1,3,5,-3,4,-1,8,6};
		int b[]=new int[a.length];
		int flag=5;
       for(int x=0;x<a.length;x++)
       {
    	   for(int y=0;y<a.length;y++)
    	   {
    	b[0]=a[x]+a[y]; 
    	   if(b[0]==flag)
    	   {
    		   
    		   System.out.println(a[x]+" ,"+a[y]);
    	   }}}}}
    	  
    	  
	


