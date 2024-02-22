package Task910;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx 
{
	public static void main(String[] args) {
		
		
		try 
		{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("E://vivek.txt"));
			 Student s =  (Student) in.readObject();
			System.out.println(s.id+" "+s.firstname);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
}
