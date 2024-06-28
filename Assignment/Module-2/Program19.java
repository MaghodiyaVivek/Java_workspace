//W.A.J.P to find all interleaving of given strings. 

package Moduel2;
import java.util.ArrayList;
import java.util.List;

public class Program19 
{

	public static void main(String[] args) {
        String s1 = "AB";
        String s2 = "CD";

        List<String> interleavings = findInterleavings(s1, s2);
        
        System.out.println("Interleavings of " + s1 + " and " + s2 + ": ");
        for (String interleaving : interleavings) {
            System.out.println(interleaving);
        }
    }

    public static List<String> findInterleavings(String s1, String s2) {
        List<String> interleavings = new ArrayList<>();
        findInterleavingsHelper(s1, s2, "", interleavings);
        return interleavings;
    }

    private static void findInterleavingsHelper(String s1, String s2, String current, List<String> result) {
        if (s1.isEmpty() && s2.isEmpty()) {
            result.add(current);
        }

        if (!s1.isEmpty()) {
            findInterleavingsHelper(s1.substring(1), s2, current + s1.charAt(0), result);
        }

        if (!s2.isEmpty()) {
            findInterleavingsHelper(s1, s2.substring(1), current + s2.charAt(0), result);
        }
    }
}
