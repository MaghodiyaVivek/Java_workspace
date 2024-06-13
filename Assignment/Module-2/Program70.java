package javaprogram;
//Write a Java program to increase the size of an array list

import java.util.ArrayList;

public class Program70
{
    public static void main(String[] args) 
    {
        
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original ArrayList: " + list);

        list.add(6);
        list.add(7);
        System.out.println("ArrayList after increasing size: " + list);
    }
}


