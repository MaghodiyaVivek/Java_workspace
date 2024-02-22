//W.A.J.P to find the second most frequent character in a given string. The given string
//is: successes The second most frequent char in the string is: c 

package Moduel2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Program20 
{

	public static void main(String[] args) 
	{
        String input = "successes";
        char secondMostFreqChar = findSecondMostFrequentChar(input);
        
        System.out.println("The given string is: " + input);
        System.out.println("The second most frequent char in the string is: " + secondMostFreqChar);
    }

    public static char findSecondMostFrequentChar(String input) 
    {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) 
        {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        char firstMostFreqChar = '\0';
        char secondMostFreqChar = '\0';

        int maxFreq = Integer.MIN_VALUE;
        int secondMaxFreq = Integer.MIN_VALUE;

        for (Entry<Character, Integer> entry : charFrequencyMap.entrySet()) 
        {
            if (entry.getValue() > maxFreq) 
            {
                secondMaxFreq = maxFreq;
                secondMostFreqChar = firstMostFreqChar;
                
                maxFreq = entry.getValue();
                firstMostFreqChar = entry.getKey();
            } 
            else if (entry.getValue() > secondMaxFreq && entry.getValue() != maxFreq) 
            {
                secondMaxFreq = entry.getValue();
                secondMostFreqChar = entry.getKey();
            }
        }

        return secondMostFreqChar;
    }
}
