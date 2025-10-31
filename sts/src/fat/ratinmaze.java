import java.util.*;

class ratinmaze {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int m = x.nextInt();
        int mat[][] = new int[n][m];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = x.nextInt();
            }
        }

        int res[][] = new int[n][m];

        if (rat(mat, n, m, 0, 0, res)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println(); // Move to next row
            }
        } else {
            System.out.println("NO path available!");
        }
    }

    static boolean rat(int[][] mat, int n, int m, int str, int stc, int[][] res) {
        // Destination reached
        if (str == n - 1 && stc == m - 1 && mat[str][stc] == 1) {
            res[str][stc] = 1;
            return true;
        }

        // Valid move
        if (str >= 0 && stc >= 0 && str < n && stc < m && mat[str][stc] == 1 && res[str][stc] == 0) {
            res[str][stc] = 1;

            // Move Down
            if (rat(mat, n, m, str + 1, stc, res)) return true;

            // Move Right
            if (rat(mat, n, m, str, stc + 1, res)) return true;

            // Backtrack
            res[str][stc] = 0;
        }

        return false;
    }
}
