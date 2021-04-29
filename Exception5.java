import java.util.*;
class Exception5
{
	public static void main(String arg[])
	{
      Scanner sobj = new Scanner(System.in);
	  System.out.println("enter first number");
	  int no1 = sobj.nextInt();
	   System.out.println("enter second number");
	  int no2 = sobj.nextInt();
	  try
	  {
         System.out.println("inside try block");
         int ans = no1 / no2;
	    System.out.println("answer is:"+ans);
	  }
      catch(ArrayIndexOutOfBoundsException obj)
      {
      	System.out.println("array index out of bound");
      } 
      catch(ArithmeticException obj)
      {
      	System.out.println("divide by zero Exception");
      }
      catch(Exception obj)
      {
      	System.out.println("Generic catch");
      }

      finally
      {
      	System.out.println("inside finally block");
      }
       System.out.println("end of main block");
	}
}