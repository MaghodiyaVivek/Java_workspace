package javaprogram;
//Write a Java program to print all the elements of an Array List using the position of the elements.

import java.util.ArrayList;

public class Program72 
{
    public static void main(String[] args) 
    {
        
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");

        for (int i = 0; i < list.size(); i++) 
        {
            String element = list.get(i);
            System.out.println("Position " + (i + 1) + ": " + element);
        }
    }
}

