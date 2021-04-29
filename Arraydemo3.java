import java.lang.*;
import java.util.Scanner;

class Arraydemo3
{
	public static void main(String arg[])
	{

		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		int i =0 , j= 0;

		for(i=0; i < arr.length; i++)            //to travel row
		{
			for(j=0; j< arr[i].length; j++)     //to travel column
			{
				System.out.println(arr[i][j]);
			}
		}
	}
}
// 1 2 3 4 5 6  7 8 9