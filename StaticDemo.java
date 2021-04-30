import java.lang.*;

class Demo
{
	public int x,y;
	public static int z;

	public void fun()
	{
       System.out.println("inside fun");
	}
	public static void gun()
	{
      System.out.println("inside gun");
     //  System.out.println("value of x :+this.x");
	}
}

class StaticDemo
{
	public static void main(String arg[])
	{
		System.out.println("value of z:"+Demo.z);
		Demo.gun();
		Demo obj = new Demo();
		obj.fun();
		obj.gun();
	}

}