import java.util.*;

class Student
{
	public String Name;
	public int Marks;
	public Student(String str, int no)
	{
		this.Name = str;
		this.Marks = no;
	}

	public void Display()
	{
		System.out.println("Name:"+this.Name+"Marks:"+this.Marks);
	}

}

class Custom
{
	public static void main(String[] args) 
	{
		LinkedList<Student> ll = new LinkedList<Student>();
		ll.add(new Student("sayali",50));
		ll.add(new Student("sagar",40));
		ll.add(new Student("ashu",30));
		
		System.out.println("size of LinkList :"+ll.size());
		Student ref = null;
		Iterator iobj = ll.Iterator();
		System.out.println("contents of LinkList are:");
		while(iobj.hasNext())
		{
			ref =(Student)iobj.next();
			ref.Display();
		}
		ll.clear();
	}
}