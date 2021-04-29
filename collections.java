
import java.util.*;	// It contsins all classes of collections

class Collections
{
	public static void main(String arg[])
	{
		ArrayList <Integer> aobj1 = new ArrayList<Integer>();
		aobj1.add(11);
		aobj1.add(21);
		aobj1.add(51);
		System.out.println("Elements are : "+aobj1);
		System.out.println("oth elements is :"+aobj1.get(0));
		aobj1.set(0,111);
		aobj1.add(1,121);
		System.out.println("Number of elemets are : "+aobj1.size());
		System.out.println("Elements are : "+aobj1);
		aobj1.remove(0);
		System.out.println("Elements are : "+aobj1);
		for(Integer i : aobj1)					// Loop to iterate the contents 
		{
			System.out.println(i);
		}
		Iterator iobj = aobj1.iterator();		// Iterator to iterate the contets
		while(iobj.hasNext())
		{
			System.out.println(iobj.next());
		}
		aobj1.clear();		// Remove all elements
	}
}
