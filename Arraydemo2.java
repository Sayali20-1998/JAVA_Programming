//accept N number from user and display its addition

import java.lang.*;
import java.util.Scanner;

class Arraydemo2
{
	public static void main(String arg[])
	{   
	    int icnt = 0; 
		Scanner sobj = new Scanner(System.in);
		int size = 0;

		System.out.println("enter number of elements");
		size = sobj.nextInt();

		int arr[] = new int[size];    //  memory for array

		System.out.println("enter number of array");
		for(icnt=0; icnt < arr.length; icnt++)
		{
			arr[icnt] = sobj.nextInt();
		}
        
        int isum = 0;
        for(icnt=0; icnt< arr.length; icnt++)
        {
        	isum = isum + arr[icnt];
        }
        System.out.println("addition of all elements:"+isum);
	}
}