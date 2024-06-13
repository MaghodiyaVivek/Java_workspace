package javaprogram;
//Write a Java program to replace the second element of an Array List with the specified element

import java.util.ArrayList;

public class Program71
{
    public static void main(String[] args) 
    {
     
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Original ArrayList: " + list);

        String specifiedElement = "Orange";
        int indexToReplace = 1;
        list.set(indexToReplace, specifiedElement);

        System.out.println("ArrayList after replacing second element: " + list);
    }
}
