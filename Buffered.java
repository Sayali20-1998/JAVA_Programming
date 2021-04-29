import java.io.*;

class Buffered
{
	public static void main(String arg[])  throws IOException
	{
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(iobj);
       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter one number");
		
        int no = Integer.parseInt(br.readLine());
    	System.out.println("entered number is :"+no);
    	
	}
}