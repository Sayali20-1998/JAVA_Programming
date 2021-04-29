//accept n number from user
//store it into array 
//display largest number from array
import java.lang.*;
import java.util.Scanner;


class arrayassign
{
   public static void main(String[] args)
    {
		Scanner sobj = new Scanner(System.in);
        System.out.println("enter number of elements in array:");
        int size = sobj.nextInt();                         //accept size from user 

        int arr[]= new int[size];                          //store in array 
        
        System.out.println("enter elements of array:");
        for(int i= 0; i< size; i++)
        {
        	arr[i]= sobj.nextInt();
        }	
        
        int max = arr[0];

        for(int i=0; i<size; i++)
        {
        	if(max>arr66523[i])
        	{
        		max = arr[i];
        	}
        }
        System.out.println("largest number is:"+max);
	}
}

	
