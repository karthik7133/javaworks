package classassignment;


import java.util.Arrays;
import java.util.Scanner;

public class jack {
    public static int digitSum(int x) {
        int s = 0;
        while (x > 0) {
            s += x % 10;
            x /= 10;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        
        Arrays.sort(arr, (a, b) -> {
            int sa = digitSum(a);
            int sb = digitSum(b);
            return sa != sb ? sa - sb : a - b;
        });

        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int sum = digitSum(arr[m]);
            if (sum == d) {
                ans = arr[m];
                r = m - 1;
            } else if (sum < d) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
