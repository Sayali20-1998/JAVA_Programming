import java.lang.*;
class demo1
{
	public int i;
	public int j;

	public demo1(int x,int y)
	{
		this.i = x;
		this.j = y;
	}
}

class object
{
	public static void main(String[] args)
    {
		demo1 obj1 = new demo1(11,21);
		demo1 obj2 = new demo1(11,21);
		if(obj1==obj2)
		{
			System.out.println("objects are equal");
		}

			System.out.println("Hashcode of obj1:"+obj1.hashcode());
			System.out.println("Hashcode of obj2:"+obj2.hashcode());
	}
}