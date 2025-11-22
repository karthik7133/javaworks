package fat;
import java.util.HashSet;
//no of permutations =>n!
//t.c and s.c.
//i/p string output=> no of permutations or what are permutations.
public class permutations {
	static HashSet<String > set= new HashSet<>();
    // Function to print all permutations
    public static void printPermutations(String str, String ans) {
        // Base case: if string is empty, print the answer
        if (str.length() == 0) {
        	set.add(ans);
            return;
        }
        // Loop through the string
        for (int i = 0; i < str.length(); i++) {
            // Pick each character one by one
            char ch = str.charAt(i);
            // Remaining string after excluding the picked character
            String ros = str.substring(0, i) + str.substring(i + 1);
            // Recursive call
            printPermutations(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        String s = "aabc";  // You can change this to any string
        System.out.println("All permutations of " + s + " are:");
        printPermutations(s, "");
        System.out.println("No of permutation are :"+set.size());
        for(String st :set) {
        	System.out.println(st+" ");
        }
    }
}

