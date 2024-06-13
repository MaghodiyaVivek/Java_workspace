package javaprogram;
//Write a Java program to iterate through all elements in a hash list.
import java.util.HashSet;
import java.util.Iterator;

public class Program58 
{
    public static void main(String[] args) 
    {
      
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Mango");
        set.add("Elderberry");

        System.out.println("Original HashSet: " + set);

        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) 
        {
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println("Iterating using enhanced for loop:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}
