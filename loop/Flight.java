package loop;
import java.util.Scanner;
public class Flight 
{
	public static void main(String[] args) 
	{
		int a1=15345;
		int a2=13234;
		int a3=14355;
		int taxes=1234;
	System.out.println( "select one way");
	Scanner sc=new Scanner(System.in);
	String t=sc.next();
	if(t.equals("oneway"))
	{
		System.out.println("enter departure date and time");
	     String dt=sc.next();
	     System.out.println("enter no.of travellers");
	     int travel=sc.nextInt();
     System.out.println("select broading point");
     System.out.println("newdelhi");
     System.out.println("mumbai");
     System.out.println("kolkata");
     System.out.println("chennai");
     
     String b=sc.next();
     System.out.println("select destination point");
     System.out.println("newdelhi");
     System.out.println("mumbai");
     System.out.println("kolkata");
     System.out.println("chennai");
     String d=sc.next();
     if(b.equals ("newdelhi"))
     {
     switch(d)
     {
     case "mumbai":
     System.out.println(" IndiGo     09:10------->16:05   " +a1 +" RS");
     System.out.println("            1 stop       6h 25m\n");
     System.out.println(" Air India  08:10------->17:05   "+a2 + " RS");
     System.out.println("            1 stop       6h 55m\n");
     System.out.println(" Air Asia   04:10------->12:05   "+a3+ " RS");
     System.out.println("            1 stop       6h 01m\n");
     break;
     case "kolkata":
         System.out.println(" IndiGo     09:10------->16:05" +a1+ " RS");
         System.out.println("            1 stop       6h 25m\n");
         System.out.println(" Air India  08:10------->17:05" +a2+ " RS");
         System.out.println("            1 stop       6h 55m\n");
         System.out.println(" Air Asia   04:10------->12:05"+a3+" RS");
         System.out.println("            1 stop       6h 01m\n");
    	 break;
     case "chennai":
         System.out.println(" IndiGo     09:10------->16:05"+a1+"  RS");
         System.out.println("            1 stop       6h 25m\n");
         System.out.println(" Air India  08:10------->17:05"+a2+"  RS");
         System.out.println("            1 stop       6h 55m\n");
         System.out.println(" Air Asia   04:10------->12:05"+a3+"  RS");
         System.out.println("            1 stop       6h 01m\n");
         break;
     }
	}
	else if(b.equals("chennai"))
	{
		switch(d)
	     {
	     case "mumbai":
	     System.out.println(" IndiGo     09:10------->16:05   " +a1 +" RS");
	     System.out.println("            1 stop       6h 25m\n");
	     System.out.println(" Air India  08:10------->17:05   "+a2 + " RS");
	     System.out.println("            1 stop       6h 55m\n");
	     System.out.println(" Air Asia   04:10------->12:05   "+a3+ " RS");
	     System.out.println("            1 stop       6h 01m\n");
	     break;
	     case "kolkata":
	         System.out.println(" IndiGo     09:10------->16:05" +a1+ " RS");
	         System.out.println("            1 stop       6h 25m\n");
	         System.out.println(" Air India  08:10------->17:05" +a2+ " RS");
	         System.out.println("            1 stop       6h 55m\n");
	         System.out.println(" Air Asia   04:10------->12:05"+a3+" RS");
	         System.out.println("            1 stop       6h 01m\n");
	    	 break;
	     case "newdelhi":
	         System.out.println(" IndiGo     09:10------->16:05"+a1+"  RS");
	         System.out.println("            1 stop       6h 25m\n");
	         System.out.println(" Air India  08:10------->17:05"+a2+"  RS");
	         System.out.println("            1 stop       6h 55m\n");
	         System.out.println(" Air Asia   04:10------->12:05"+a3+"  RS");
	         System.out.println("            1 stop       6h 01m\n");
	         break;
	     }
	}
	else if(b.equals("kolkata"))
	{
		switch(d)
	     {
	     case "mumbai":
	     System.out.println(" IndiGo     09:10------->16:05   " +a1 +" RS");
	     System.out.println("            1 stop       6h 25m\n");
	     System.out.println(" Air India  08:10------->17:05   "+a2 + " RS");
	     System.out.println("            1 stop       6h 55m\n");
	     System.out.println(" Air Asia   04:10------->12:05   "+a3+ " RS");
	     System.out.println("            1 stop       6h 01m\n");
	     break;
	     case "newdelhi":
	         System.out.println(" IndiGo     09:10------->16:05" +a1+ " RS");
	         System.out.println("            1 stop       6h 25m\n");
	         System.out.println(" Air India  08:10------->17:05" +a2+ " RS");
	         System.out.println("            1 stop       6h 55m\n");
	         System.out.println(" Air Asia   04:10------->12:05"+a3+" RS");
	         System.out.println("            1 stop       6h 01m\n");
	    	 break;
	     case "chennai":
	         System.out.println(" IndiGo     09:10------->16:05"+a1+"  RS");
	         System.out.println("            1 stop       6h 25m\n");
	         System.out.println(" Air India  08:10------->17:05"+a2+"  RS");
	         System.out.println("            1 stop       6h 55m\n");
	         System.out.println(" Air Asia   04:10------->12:05"+a3+"  RS");
	         System.out.println("            1 stop       6h 01m\n");
	         break;
	     }
	}
	else if(b.equals("mumbai"))
		switch(d)
	     {
	     case "newdelhi":
	     System.out.println(" IndiGo     09:10------->16:05   " +a1 +" RS");
	     System.out.println("            1 stop       6h 25m\n");
	     System.out.println(" Air India  08:10------->17:05   "+a2 + " RS");
	     System.out.println("            1 stop       6h 55m\n");
	     System.out.println(" Air Asia   04:10------->12:05   "+a3+ " RS");
	     System.out.println("            1 stop       6h 01m\n");
	     break;
	     case "kolkata":
	         System.out.println(" IndiGo     09:10------->16:05" +a1+ " RS");
	         System.out.println("            1 stop       6h 25m\n");
	         System.out.println(" Air India  08:10------->17:05" +a2+ " RS");
	         System.out.println("            1 stop       6h 55m\n");
	         System.out.println(" Air Asia   04:10------->12:05"+a3+" RS");
	         System.out.println("            1 stop       6h 01m\n");
	    	 break;
	     case "chennai":
	         System.out.println(" IndiGo     09:10------->16:05"+a1+"  RS");
	         System.out.println("            1 stop       6h 25m\n");
	         System.out.println(" Air India  08:10------->17:05"+a2+"  RS");
	         System.out.println("            1 stop       6h 55m\n");
	         System.out.println(" Air Asia   04:10------->12:05"+a3+"  RS");
	         System.out.println("            1 stop       6h 01m\n");
	         break;
	}
     System.out.println("Enter Specific Filgifht ");
     String f=sc.next();
     if(f.equals ("IndiGo"))
         {
    	 System.out.println(" IndiGo     09:10------->16:05"+a1+"  RS");
         System.out.println("            1 stop       6h 25m\n");
         }
     else if(f.equals("AirIndia"))
    		 {
    	 System.out.println(" Air India  08:10------->17:05"+a2+"  RS");
         System.out.println("            1 stop       6h 55m\n");
    		 }
     else if(f.equals("AirAsia"))
     {
    	 System.out.println(" Air Asia   04:10------->12:05"+a3+"  RS");
         System.out.println("            1 stop       6h 01m\n");
     }
     
     System.out.println(" payment details");
     System.out.println(dt+"    "+b+"---->"+d+"\n");
     System.out.println("         economy|"+travel+" travellers");
     System.out.println("enter travellers details");
     System.out.println("enter name");
     String name[]=new String[10];
     for(int x=0;x<travel;x++) 
     {
      name[x]=sc.next();
     }
     System.out.println("enter mobile number");
     long m=sc.nextLong();
     System.out.println("proceed to preview");
     System.out.println(dt+"    "+b+"---->"+d);
     System.out.println("         economy|"+travel+"travellers");
     for(int x=0;x<travel;x++)
     {
     System.out.println(name[x]+"                      adult");
     }
     System.out.println("base fare   "+a1*travel+" RS");
     System.out.println("taxes & fees "+     taxes*travel+" RS");  
     System.out.println("Total amount "+    (a1*travel+taxes*travel)+" RS\n");
     System.out.println("proceed to payment");
     System.out.println("THANK YOU VISIT AGAIN");
     
     }
	}
	}


