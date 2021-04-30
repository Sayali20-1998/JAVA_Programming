class demo extends Thread
{
	public void run()
	{
		System.out.println("Thread scheduled");
		for(int i = 1; i<=100; i++)
			{
				System.out.println("value is:"+i);
			}
	}

}

class Threads
{
	public static void main(String arg[]) throws Exception 
	{
	 	System.out.println("inside main Thread");
	 	Thread t1 = new Thread(new demo());
	 	Thread t2 = new Thread(new demo());

	 	t1.start();
	 	t1.join();

	    t2.start();
	 	t2.join();
	 	
	 System.out.println("end of main Thread");
	 
	}
}