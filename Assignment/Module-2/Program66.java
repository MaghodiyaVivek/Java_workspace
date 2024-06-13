package javaprogram;
//Write a Java program to join two array lists.

import java.util.ArrayList;

public class Program66 
{
    public static void main(String[] args) 
    {
        
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("vivek1");
        list2.add("vivek2");
        list2.add("vivek3");

        System.out.println("First ArrayList: " + list1);
        System.out.println("Second ArrayList: " + list2);

        ArrayList<String> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);

        System.out.println("Joined ArrayList: " + joinedList);
    }
}

