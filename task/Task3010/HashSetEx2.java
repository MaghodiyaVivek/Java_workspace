package Task3010;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2 
{

	public static void main(String[] args) 
	{
		
		HashSet set = new HashSet<>();
		
		set.add("Android");
		set.add("Java");
		set.add("Php");
		set.add("Dm");
		set.add("back end");
		set.add("front end");
		
		//set.add(4);
		//set.add(2);
		//set.add(3);
		//set.add(1);	
		
		//set.add('b');
		//set.add('d');
		//set.add('c');
		//set.add('a');
		
		
		
		
		/*
		 * HashSet set2 = new HashSet<>();
		 * 
		 * set2.add(1); set2.add(2); set2.add(3);
		 */
		
		
		//set.addAll(set2);
		
		Iterator i = set.iterator();//value fetch
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
}
