package javaprogram;
//Write a Java program to copy one array list into another.
import java.util.ArrayList;

public class Program55 
{
    public static void main(String[] args) 
    {
        
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        originalList.add("Date");
        originalList.add("Elderberry");

        System.out.println("Original ArrayList: " + originalList);

        ArrayList<String> copiedList = new ArrayList<>();

        copiedList.addAll(originalList);

        System.out.println("Copied ArrayList: " + copiedList);
    }
}
