package leetcode;

public class maxarea_3000 {
	public static void main(String[] args) {
		int [][] a= {
				{2,6},{5,1},{3,10},{8,4}
		};
		caL(a);
	}
		 public static int caL(int[][] d) {
		        double maxDiag = 0;
		        int maxArea = 0;

		        for (int i = 0; i < d.length; i++) {
		            int length = d[i][0];
		            int width = d[i][1];
		            double currentDiag = Math.sqrt((double)length * length + (double)width * width);
		            int currentArea = length * width;

		            if (currentDiag > maxDiag) {
		                maxDiag = currentDiag;
		                maxArea = currentArea;
		            } else if (currentDiag == maxDiag) {
		                if (currentArea > maxArea) {
		                    maxArea = currentArea;
		                }
		            }
		        }
		        return maxArea;
		    
	}
}
