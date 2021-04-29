abstract class area
{
	public float Radius;
	public area(float no)
	{
		 Radius = no;
	}
	public abstract float CalculateArea();             //Abstract method 

	public void Display()	                          //Concrete method
	{
		System.out.println("radius is :"+Radius);

	}
}

class calculation extends area
{
	public calculation(float value)
	{
		super(value);                               //call the Parent class constructor

	}
	public float CalculateArea()                    //concreate method
	{
		return 3.14f * Radius * Radius;
	}
}

class Abstractdemo
{
	public static void main(String arg[])
	{
		area aobj = new calculation(2.0f);		   //Allowed(UPCASTING)
		float bret = aobj.CalculateArea();
		aobj.Display();
		System.out.println("Area of  circle :"+bret);
		//Area obj = new Area(3.5f):Object creation is not
		//allowed for abstract class
		calculation obj = new calculation(10.5f);
		                                                 //37->19->21->4->6->21->37
		float ret = obj.CalculateArea();
		System.out.println("Area of  circle is :"+ret);
	}
}