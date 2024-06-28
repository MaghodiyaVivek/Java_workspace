package javaprogram;
//Write a Java program to insert an element into the array list at the first position

import java.util.ArrayList;

public class Program49
{
    public static void main(String[] args) 
    {
       
        ArrayList<String> arrayList = new ArrayList<>();

      
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");
      
        System.out.println("ArrayList before insertion: " + arrayList);

        
        String newElement = "New Element";
      
        arrayList.add(0, newElement);

        System.out.println("ArrayList after insertion: " + arrayList);
    }
}

