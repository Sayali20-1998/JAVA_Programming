//accept number from user
//store it into array
//display average of elements

import java.lang.*;
import java.util.Scanner;

class average
{
  public static void main(String[] args)
   {
	 Scanner sobj = new Scanner(System.in);
	 System.out.println("enter number of array elemnets");
	 int size = sobj.nextInt();

	 int arr[] = new int[size];

	 System.out.println("enter elemnts");
	 for(int i=0; i<size; i++)
	 {
	 	arr[i] = sobj.nextInt();
	 }	
	 int sum = 0;
	 int avg= 0;
	 for(int i=0; i<size; i++)
	 {
	 	sum = sum + arr[i];

	 }
	System.out.println("addition is:"+sum);
	 avg = sum/size;
	  System.out.println("average is:"+avg);
   }
}