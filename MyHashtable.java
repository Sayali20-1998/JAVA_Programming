import java.util.*;

class MyHashtable
{
	public static void main(String[] args) 
	{
	  Hashtable <Integer,String> ht = new  Hashtable <Integer,String>();
        
       ht.put(11,"sayali");
       ht.put(21,"amit");
       ht.put(51,"sagar");
       ht.put(101,"saya"); 

       System.out.println("elements of hashtable is:"+ht);
       if(ht.containsKey(11))
       {
       	String str = ht.get(11);
       	System.out.println("value is:"+str);
      
       }
        Integer i = null;
        ht.remove(21);
        System.out.println("updated hashtable is:"+ht);
        Set<Integer> keys = ht.keySet(); //fetch keys fromhashtable
        Iterator iobj = keys.iterator(); //apply iterator on set of keys
        while(iobj.hasNext())            //travel the hashtable
        {
        	i=(Integer) iobj.next();
        	System.out.println("key:"+i+"value:"+ht.get(i));
        }
	}
}