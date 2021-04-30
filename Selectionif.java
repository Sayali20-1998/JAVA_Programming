import java.lang.*;
import java.util.Scanner;

class Selectionif
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("enter first number");
		int ino1 = sobj.nextInt();

		System.out.println("enter second number");
		int ino2 = sobj.nextInt();

		System.out.println("enter third number");
		int ino3 = sobj.nextInt();

		if((ino1>=ino2) && (ino1>=ino3))
		{
			System.out.println("largest number is:"+ino1);
		}
		else if((ino2>=ino2) && (ino2>=ino3))
		{
			System.out.println("largest number is:"+ino2);
		}
		else
		{
			System.out.println("largest number is:"+ino3);
		}
	}
}