package javaprogram;
//Write a Java program to remove the third element from an array list.

import java.util.ArrayList;

public class Program52
{
    public static void main(String[] args) 
    {
       
        ArrayList<String> arrayList = new ArrayList<>();

       
        arrayList.add(" 1");
        arrayList.add(" 2");
        arrayList.add(" 3");
        arrayList.add(" 4");
        arrayList.add(" 5");

        
        System.out.println("ArrayList before removal: " + arrayList);

       
        int indexToRemove = 2;

      
        if (indexToRemove >= 0 && indexToRemove < arrayList.size())
        {
            
            arrayList.remove(indexToRemove);
            System.out.println("ArrayList after removal: " + arrayList);
        } else 
        {            
            System.out.println("Index " + indexToRemove + " is out of bounds.");
        }
    }
}
