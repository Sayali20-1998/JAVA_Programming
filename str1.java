class str1
{
	public static void main(String[] args) 
	{
	   String s1 = "hello";
	   String s2 = "hello";
	   String s3 = new String("hello");
	   String s4 = new String("HELLO");

	   if(s1==s2)
       {
	   	System.out.println("string are equal");
	   }

	   if(s1==s3)
	   {
	   	 	System.out.println("string s1 and s3 are equal");
	   }

	   if(s1.equals(s3))
	   {
	   	 	System.out.println("string s1 and s3 are equal using equals method");
	   }
	   if(s1.equalsIgnoreCase(s4))
	   {
	   	System.out.println("string s1 and s4 are equal");
	   }	
	}
}