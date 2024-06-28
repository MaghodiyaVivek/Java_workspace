package javaprogram;
//Write a Java program to update specific array element by given element.

import java.util.ArrayList;

public class Program51 {
    public static void main(String[] args) 
    {
       
        ArrayList<String> arrayList = new ArrayList<>();

        
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");
        arrayList.add("Element 4");

       
        System.out.println("ArrayList before update: " + arrayList);

       
        int index = 2; 
        String newElement = "Updated Element";

        if (index >= 0 && index < arrayList.size()) 
        {          
            arrayList.set(index, newElement);

            System.out.println("ArrayList after update: " + arrayList);
        } 
        else 
        {
            // Handle the case where the index is out of bounds
            System.out.println("Index " + index + " is out of bounds.");
        }
    }
}

