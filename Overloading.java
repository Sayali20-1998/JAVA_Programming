import java.lang.*;

class Demo
{
	public int Add(int no1, int no2)
	{return no1 + no2 ;}

	public int Add(int no1, int no2,int no3)
	{return no1 + no2 + no3 ;}

	public float Add(float no1, float no2)
	{return no1 + no2 ;}

	public void fun(int no1,double no2)
	{System.out.println("inside fun1");}

	public void fun(double no1,int no2)
	{System.out.println("inside fun1");}
}

class Overloading
{
	public static void main(String arg[])
	{
		Demo obj = new Demo();
		obj.Add(11,21);
		obj.Add(11,21,51);
		obj.Add(3.4f,6.5f);
		obj.fun(11,3.5);
		obj.fun(3.5,21);
	}
}