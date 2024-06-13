package javaprogram;
//Write a Java program to compare two array lists.

import java.util.ArrayList;

public class Program64 
{
    public static void main(String[] args) 
    {
       
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("Apple");
        list1.add("Mango");
        list1.add("Cherry");

        list2.add("Apple");
        list2.add("Mango");
        list2.add("Cherry");

        boolean areEqual = list1.equals(list2);

        if (areEqual) 
        {
            System.out.println("The two ArrayLists are equal.");
        }
        else 
        {
            System.out.println("The two ArrayLists are not equal.");
        }
    }
}
