package loop;

public class Model {

	public static void main(String[] args) 
	{
		B b=new B();
	    b.name="kondareddy";
		b.age=23;
	    b.acdamicyear=2022;
	    b.tenthpass=2016;
	    b.hallticket=16341943;
	    b.payment=200;
	    b.gst=15;
	    System.out.println(b.name+" "+b.age+" "+b.acdamicyear+" "+b.tenthpass);
	    System.out.println(b.hallticket+" "+b.payment+" "+b.gst);
	    	
	}
		}
	class B
	{
		String name;
		int age;
		int acdamicyear;
		int tenthpass;
		int hallticket;
		int payment;
		int gst;
		public int calpayment()
		{
			return payment;
		}
		
		
	}

