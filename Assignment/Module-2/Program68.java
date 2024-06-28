package javaprogram;
//Write a Java program to convert a hash set to a List/Array List.

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class Program68 
{
    public static void main(String[] args) 
    {
        
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Mango");

        System.out.println("Original HashSet: " + set);

        List<String> list = new ArrayList<>(set);

        System.out.println("ArrayList: " + list);
    }
}

