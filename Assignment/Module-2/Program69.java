package javaprogram;
//Write a Java program to check whether a map contains key-value mappings (empty) or not.

import java.util.HashMap;

public class Program69 
{
    public static void main(String[] args) 
    {
       
        HashMap<String, Integer> map = new HashMap<>();

        if (map.isEmpty()) 
        {
            System.out.println("The HashMap is empty.");
        } 
        else 
        {
            System.out.println("The HashMap is not empty.");
        }

        map.put("1", 100);
        map.put("2", 200);

        if (map.isEmpty()) 
        {
            System.out.println("The HashMap is empty.");
        } 
        else 
        {
            System.out.println("The HashMap is not empty.");
        }

        System.out.println("HashMap: " + map);
    }
}
