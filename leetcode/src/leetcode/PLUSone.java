package leetcode;

import java.util.Arrays;

class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        System.out.println(Arrays.toString(newDigits));
    }
}