//we haveto accept the standardof the student and display time of exam depend on std
//exam of 7th std is at 9am
//exam of 8th std is 10:30am
//exam of 9th std is 11am
//exam of 10th std is 11:30am

import java.lang.*;
import java.util.Scanner;

class Selectionswitch
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
       System.out.println("enter your std");

       int standard = sobj.nextInt();

       switch(standard)
       {
       	case 7:
       	  System.out.println("your exam is at 9am.ALL THE BEST");
       	  break;

       	 case 8:
       	  System.out.println("your exam is at 10:30am.ALL THE BEST");
       	  break; 

       	  case 9:
       	  System.out.println("your exam is at 11am.ALL THE BEST");
       	  break;

       	  case 10:
       	  System.out.println("your exam is at 11:30am.ALL THE BEST");
       	  break;
       	  default:
       	  System.out.println("your entered std is wrong");

       }
   }
}
