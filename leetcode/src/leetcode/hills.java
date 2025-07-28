package leetcode;
import java.util.*;
public class hills {
    public static void main(String[] args) {
        int a[] = {2,4,1,1,6,5};
        ArrayList<Integer> b = new ArrayList<>();
        b.add(a[0]);
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i-1]) b.add(a[i]);
        }
        int hill = 0, valley = 0;
        for (int i = 1; i < b.size() - 1; i++) {
            if (b.get(i) > b.get(i-1) && b.get(i) > b.get(i+1)) hill++;
            if (b.get(i) < b.get(i-1) && b.get(i) < b.get(i+1)) valley++;
        }
        System.out.println("count:" + (hill+valley));
    }
}

