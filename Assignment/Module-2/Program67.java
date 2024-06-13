package javaprogram;
//Write a Java program to convert a hash set to an array.

import java.util.HashSet;

public class Program67 
{
    public static void main(String[] args) 
    {
       
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Mango");

        System.out.println("Original HashSet: " + set);

        String[] array = set.toArray(new String[set.size()]);


        System.out.println("Array:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}

