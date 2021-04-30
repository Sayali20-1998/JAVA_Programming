class str
{
	public static void main(String[] args) 
	{
		String s1 = "hello";

		String s2 = new String("hello");

		char arr[] = {'h','e','l','l','o'};

		String s3 = new String(arr);

		String s4 = "hello";

		String s5 = new String("hello");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
}