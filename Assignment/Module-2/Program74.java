package javaprogram;
//Write a Java program to get a collection view of the values contained in this map.

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class Program74 
{
    public static void main(String[] args) 
    {
        
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        map.put("Date", 40);

        Collection<Integer> values = map.values();

        System.out.println("Collection view of values: " + values);
    }
}
