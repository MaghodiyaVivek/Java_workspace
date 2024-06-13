package javaprogram;
//Write a Java program to sort a given array list.

import java.util.ArrayList;
import java.util.Collections;

public class Program54 
{
    public static void main(String[] args) 
    {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
       
        System.out.println("Unsorted ArrayList: " + numbers);

        Collections.sort(numbers);

        System.out.println("Sorted ArrayList: " + numbers);
    }
}
