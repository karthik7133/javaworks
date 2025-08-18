package practise;

import java.util.*;

class ChineseRemainder {
    int calculate(int size, int div[], int rem[]) {
        int j, x = 1;
        while (true) {
            for (j = 0; j < size; j++) {
                if (x % div[j] != rem[j]) {
                    break;
                }
            }
            if (j == size)
                return x;
            x++;
        }
    }
}

public class ChineseRemainderTheorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of equations: ");
        int size = sc.nextInt();

        int[] div = new int[size];
        System.out.println("Enter divisors: ");
        for (int i = 0; i < size; i++) {
            div[i] = sc.nextInt();
        }

        int[] rem = new int[size];
        System.out.println("Enter remainders: ");
        for (int i = 0; i < size; i++) {
            rem[i] = sc.nextInt();
        }

        ChineseRemainder c = new ChineseRemainder();
        int result = c.calculate(size, div, rem);

        System.out.println("The smallest solution is: " + result);
    }
}
