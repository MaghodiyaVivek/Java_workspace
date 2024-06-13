package javaprogram;
//Write a Java program to iterate through all elements in an array list.

import java.util.ArrayList;

public class Program48 
{
    public static void main(String[] args) 
    {
       
        ArrayList<String> fruits = new ArrayList<>();
      
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
  
        System.out.println("Iterating through the ArrayList using a for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating through the ArrayList using an indexed loop:");
        for (int i = 0; i < fruits.size(); i++)
        {
            System.out.println(fruits.get(i));
        }
    }
}
