import java.util.*;

class AgeException extends Exception
{
	public AgeException(String str)
	{
		super(str);
	}
}

class Exception7
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter your age :");
        int age = sobj.nextInt();

        try
        {
         if(age < 18)
          {   
            AgeException aobj = new AgeException("age is less than 18");
        		throw aobj;
          }
        }
        catch(AgeException obj)
        {
        	System.out.println("Exception occured"+obj);
        }
    }    
}