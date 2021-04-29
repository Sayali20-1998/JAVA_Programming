class command
{
	public static void main(String arg[]) 
	{
		if(arg.length != 2)
		{
			System.out.println("invaild number of arguments");
			return;
		}

		int no1 = Integer.parseInt(arg[0]);
	    int no2 = Integer.parseInt(arg[1]);
        int ret = no1 + no2;
        System.out.println("Addition is :"+ret);
	}
}

// javac command.java
//java command 10 20                                                                                                                                                                                                      
