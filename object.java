
class Demo // extends Object
{
	public int i;
	public int j;

	public Demo(int x,int y)//Parameterside Contructor
	{
		this.i = x;
		this.j = y;
	}
	public boolean equals(Demo obj)//Method(1)  Override
	{
		if((this.i ==obj.i) && (this.j == obj.j))
			return true;
		else
			return false;

	}
	protected void finalize()	//Method(2)
	{
		System.out.println("Inside finalize method");
	}
}
class Object1
{
	public static void main(String arg[])
	{
		Demo obj1 = new Demo(11,21);
		Demo obj2 = new Demo(11,21);

		
		if(obj1 == obj2)
		{
			System.out.println("Objects are same");
		}


		System.out.println("Hashcode of obj1:"+obj1.hashCode());//Method(3)
		System.out.println("Hashcode of obj2:"+obj2.hashCode());

		
		if(obj1.equals(obj2))	//calling (1)
		{
			System.out.println("Object are equal");
		}

		
		Class ref = obj1.getClass();	//Method(4)

		
		System.out.println("Name of our class is:"+ref.getName());

		
		System.out.println(obj1);
		System.out.println(obj2.toString());//Method(5)

		
		obj1 = null;
		obj2 = null;

		
		System.gc();	//Method(5)

	}
}