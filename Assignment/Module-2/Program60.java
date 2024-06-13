package javaprogram;
//Write a Java program to associate the specified value with the specified key in a Hash Map
import java.util.HashMap;

public class Program60 
{
    public static void main(String[] args) 
    {
        
        HashMap<String, Integer> map = new HashMap<>();

        String key = "Key1";
        Integer value = 100;

        map.put(key, value);

        System.out.println("HashMap after inserting the key-value pair: " + map);

        Integer retrievedValue = map.get(key);
        System.out.println("Value associated with the key '" + key + "': " + retrievedValue);
    }
}
