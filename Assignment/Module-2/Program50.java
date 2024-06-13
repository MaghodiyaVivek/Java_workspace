package javaprogram;
//Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;

public class Program50 
{
    public static void main(String[] args) 
    {
       
        ArrayList<String> arrayList = new ArrayList<>();
        
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");
        arrayList.add("Element 4");

        System.out.println("ArrayList: " + arrayList);
     
        int index = 2; 
        
        if (index >= 0 && index < arrayList.size()) 
        {
            
            String element = arrayList.get(index);

          
            System.out.println("Element at index " + index + ": " + element);
        } else {
           
            System.out.println("Index " + index + " is out of bounds.");
        }
    }
}
