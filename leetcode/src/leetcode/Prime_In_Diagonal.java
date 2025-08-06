package leetcode;

public class Prime_In_Diagonal {
	public static void main(String[] args) {
		int[][] matrix = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
			};
		for(int i=0;i<matrix.length;i++) {
			if(isprime(matrix[i][i])) {
				System.out.print(matrix[i][i]+" ");
			}
			if(isprime(matrix[i][matrix.length-i-1])) {
				System.out.print(matrix[i][matrix.length-i-1]+" ");
			}
			
		}
		
	}
	public static boolean isprime(int n) {
    if (n <= 1) { 
        return false;
    }
    for (int i = 2; i * i <= n; i++) { 
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
}
