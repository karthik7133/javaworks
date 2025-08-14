package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class big3digitnum {
	public static void main(String[] args) {
        String num = "67771333399999";
        ArrayList<Integer> threeDigitNumbers = new ArrayList<>();
        
        for (int i = 0; i <= num.length() - 3; i++) {
            char current = num.charAt(i);
            if (current == num.charAt(i + 1) && current == num.charAt(i + 2)) {
                threeDigitNumbers.add(Character.getNumericValue(current));
            }
        }
        
        if (!threeDigitNumbers.isEmpty()) {
            Collections.sort(threeDigitNumbers, Collections.reverseOrder());
            System.out.print("\""+threeDigitNumbers.get(0)+"\"");
        } else {
            System.out.println("No three consecutive digits found.");
        }
    }
}
