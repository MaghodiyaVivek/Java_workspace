package javaprogram;
//Write a Java program to reverse elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class Program62 
{
    public static void main(String[] args) 
    {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original ArrayList: " + list);

        Collections.reverse(list);

        System.out.println("Reversed ArrayList: " + list);
    }
}
