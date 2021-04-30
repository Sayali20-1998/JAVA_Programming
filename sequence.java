//accept the radius of circle from user and calculate its area and circumference.
import java.util.Scanner;
import java.lang.*;

class Sequence
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("enter radius of circle");
		float radius = sobj.nextFloat();

         float area = 3.14f * radius * radius;
		float circumference =2 * 3.14f * radius;

		System.out.println("area of circle:"+area);
		System.out.println("circumference:"+circumference);
		}
}
