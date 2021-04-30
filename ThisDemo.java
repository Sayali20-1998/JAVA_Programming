import java.lang.*;

class Demo
{
	public int x , y;
	public Demo()
	{   
		//this(11,21);
		System.out.println("inside default constructor");
	}
	public Demo(int a, int b)
	{
		this();                                         //call to default constructor
		System.out.println("parametrised constructor");
		this.x = a;
		this.y = b;
	}
}
class ThisDemo
{
	public static void main(String arg[])
	{
	  Demo obj1 = new Demo();
	 Demo obj2 = new Demo(11,21);
	}
}