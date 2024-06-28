package javaprogram;
//Write a Java program to extract a portion of an array list.

import java.util.ArrayList;
import java.util.List;

public class Program63 
{
    public static void main(String[] args) 
    {
      
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println("Original ArrayList: " + list);

        int startIndex = 2;
        int endIndex = 5;   

        List<Integer> subList = list.subList(startIndex, endIndex);

        System.out.println("Extracted portion of the ArrayList: " + subList);
    }
}
