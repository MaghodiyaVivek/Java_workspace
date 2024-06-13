package javaprogram;
//Write a Java program to get the number of elements in a hash set.
import java.util.HashSet;

public class Program59 
{
    public static void main(String[] args) 
    {
     
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Mango");
        set.add("hii");

        System.out.println("HashSet: " + set);

        int size = set.size();

        System.out.println("Number of elements in the HashSet: " + size);
    }
}

