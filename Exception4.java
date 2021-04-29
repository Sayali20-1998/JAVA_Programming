import java.util.*;

class Exception2
{
	public static void main(String arg[])
	{
        int arr[] = {10,20,30,40,50};
        System.out.println("Array created");
       Scanner sobj = new Scanner(System.in);	
	   System.out.println("enter index of array");
	   int index = sobj.nextInt();
	   try
	   {
         System.out.println("inside try block");
	     System.out.println("Array element at specified index is:"+arr[index]);//exception
	     System.out.println("End of try");
        }
        
        finally
        {
        	System.out.println("inside finally block");
        }
          System.out.println("End of main");
	}
}