package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class big3digitnum {
	public static void main(String[] args) {
		String num="234444";
		String result = "";
        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)) {
                String current = num.substring(i, i + 3);
                if (current.compareTo(result) > 0) {
                    result = current;
                }
            }
        }
        System.out.println(result) ;
    }
}
