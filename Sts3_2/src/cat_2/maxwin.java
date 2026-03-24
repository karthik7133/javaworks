package cat_2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class maxwin {
    public static void main(String[] args) {
    	Scanner x = new Scanner(System.in);
    	int m=x.nextInt();
        int[] a = new int[m];
        for(int i=0;i<m;i++)a[i]=x.nextInt();
        int k = 3;
        int n = a.length;
        int res[] = new int[n - k + 1];
        int index = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && a[dq.peekLast()] < a[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                res[index++] = a[dq.peekFirst()];
            }

        }
        System.out.println(Arrays.toString(res));
    }
}
