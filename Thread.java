class marvellous
{
	synchronized public void Display(String str)
	{
		System.out.println("{"+str);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception obj)
		{
			System.out.println("Exception occured:"+obj);
		}
		System.out.println("}");
	}
}
class demo extends Thread
{
	String message;
	marvellous obj;

	public demo(marvellous ref , String s)
	{
		this.obj = ref;
		this.message = s;
	}
	public void run()
	{
		obj.Display(message);
	}
}

class Thread
{
	public static void main(String[] args) throws Exception
	{ 
	  System.out.println("inside main");
	  marvellous mobj = new marvellous();
	  demo obj1 = new demo(mobj,"pp activity");
	  demo obj2 = new demo(mobj,"python");
	  demo obj3 = new demo(mobj,"logic building");
     
     obj1.start();
     obj2.start();
     obj3.start();
     System.out.println("end of main");
	}
}