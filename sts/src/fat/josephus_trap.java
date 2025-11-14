package fat;
import java.util.*;
//maze solving.
//two directions forward and backward
//appraoach recusion and backtracking 
//i/p array and give the o.p :path
public class josephus_trap {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int r = x.nextInt(); 
        
        
        int survivor = josephus(n, r);
        System.out.println("Survivor: " + survivor);
    }
    
    static int josephus(int n, int r) {
        int survivor = 0;
        for(int i = 2; i <= n; i++) {
            survivor = (survivor + r) % i;
        }
        return survivor + 1; 
    }
}