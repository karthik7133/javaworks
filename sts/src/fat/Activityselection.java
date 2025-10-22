package fat;
import java.util.*;

public class Activityselection {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int s[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            s[i] = x.nextInt();
        }
        int e[] = new int[n];
        for(int i = 0; i <n; i++) {
            e[i] = x.nextInt();
        }
        System.out.print(0 + " ");
        int lastEnd = e[0];
        for(int i = 1; i <n; i++) {
            if(s[i] >= lastEnd) {
                System.out.print(i + " ");
                lastEnd = e[i];
            }
        }
    }
}