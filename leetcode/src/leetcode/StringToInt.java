package leetcode;

public class StringToInt {
    public static void main(String[] args) {
        String a = " -032";
        System.out.println(myAtoi(a));
    }
    public static int myAtoi(String a) {
        if (a == null || a.isEmpty()) return 0;

        a = a.trim();
        if (a.isEmpty()) return 0;

        int sign = 1, i = 0, n = a.length();
        long num = 0;

        if (i < n && (a.charAt(i) == '+' || a.charAt(i) == '-')) {
            if (a.charAt(i) == '-') sign = -1;
            i++;
        }

        while (i < n && Character.isDigit(a.charAt(i))) {
            num = num * 10 + (a.charAt(i) - '0');
            if (sign == 1 && num > Integer.MAX_VALUE) 
                return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }

        return (int)(sign * num);
    }
}