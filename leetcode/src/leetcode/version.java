package leetcode;

import java.util.Arrays;

public class version {
    public static void main(String[] args) {
    	System.out.println("1.4.00005 vs 1.4.5.000: " + escape("1.4.00005","1.4.5.000"));
    }

    public static int escape(String a, String b) {
    	int count = 0;
        String[] a1 = a.split("\\.");
        String[] a2 = b.split("\\.");
        System.out.println("a1: " + Arrays.toString(a1));
        System.out.println("a2: " + Arrays.toString(a2));
        int len = Math.min(a1.length, a2.length);
        int len1 = Math.max(a.length(), b.length());
        String d = (a.length() > b.length() ? a : b).substring(len + 1, len1);
        int version = (a1.length > a2.length) ? 1 : -1;
        for (int i = 0; i < len; i++) {
            int val1 = Integer.valueOf(a1[i]);
            int val2 = Integer.valueOf(a2[i]);

            if (val1 > val2) {
                return 1; 
            } else if (val1 < val2) {
                return -1; 
            } else {
                count++; 
            }
        }
        if (count == len) { 
            if (a1.length == a2.length) {
                return 0; 
            } else if (d.matches(".*[1-9].*")) {
                return version; 
            } else {
                return 0;
            }
        }

        return 0;
    }
}