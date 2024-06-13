package javaprogram;
//Write a Java program of swap two elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class Program65 
{
    public static void main(String[] args) 
    {
       
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");

        System.out.println("Original ArrayList: " + list);

        int index1 = 1; 
        int index2 = 3; 

        Collections.swap(list, index1, index2);

        System.out.println("1 and 3 " + index1 + " and " + index2 + ": " + list);
    }
}
