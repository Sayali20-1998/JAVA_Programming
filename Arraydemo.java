import java.lang.*;
import java.util.Scanner;

class Arraydemo
{
	public static void main(String arg[])
	{
     //ways in which we can create 1 dimnetional array
	//1
	  int arr[];                       //its just reference
	  arr = new int [5];                //memory allocation


	  //2
	  int brr[]= new int[5];


	  //3
	  int crr[]={10,20,30,40,50,60,70,80,90,100};

	  System.out.println("size of crr is :"+crr.length);	   

	  for(int icnt=0; icnt<crr.length; icnt++)
	  {
	  	System.out.println(crr[icnt]);
	  }       
	}
}