import java.lang.*;
class Base
	{
		public void fun(){}
		public final void gun(){}
	}

class Derived extends Base
{
	public void fun(){}
	//public void gun(){}     not allowed
}

class Finalfun
{
	public static void main(String agr[])
	{
		Derived dobj = new Derived();
		dobj.fun();
		dobj.gun();
	}
}

