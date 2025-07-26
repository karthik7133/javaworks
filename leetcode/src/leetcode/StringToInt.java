package leetcode;

public class StringToInt {
    public static void main(String[] args) {
        String a = " -032";
        System.out.println(myAtoi(a));
    }

    public static int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;
        
        int index = 0;
        int sign = 1;
        int result = 0;
        
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }
        
        if (index >= s.length()) return 0;
        

        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }
        
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            result = result * 10 + digit;
            index++;
        }
        
        return sign * result;
    }
}