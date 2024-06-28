package javaprogram;
//Write a Java program to append the specified element to the end of a hash set.
import java.util.HashSet;

public class Program57 
{
    public static void main(String[] args) 
    {
       
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        System.out.println("Original HashSet: " + set);

        String newElement = "Date";
        set.add(newElement);

        System.out.println("Updated HashSet: " + set);
    }
}
