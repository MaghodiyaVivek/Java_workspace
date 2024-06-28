package javaprogram;
//Write a Java program to count the number of key-value (size) mappings in a map.
import java.util.HashMap;

public class Program61 
{
    public static void main(String[] args) 
    {
       
        HashMap<String, Integer> map = new HashMap<>();

        map.put("1", 100);
        map.put("2", 200);
        map.put("3", 300);

        System.out.println("HashMap: " + map);

        int size = map.size();

        System.out.println("Number of key-value mappings in the HashMap: " + size);
    }
}

