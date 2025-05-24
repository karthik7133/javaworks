package cse;
import java.util.*;

public class matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        matrix k = new matrix();
        k.initialize(matrix);
        
        System.out.println("Initial matrix is:");
        k.display(matrix);
        
        Result result = k.findOrder(matrix);
        
        System.out.println("The order of the matrix is: " + result.order);
        System.out.println("Final matrix is:");
        k.display(result.finalMatrix);
    }class Result {
        int order;
        int[][] finalMatrix;

        Result(int order, int[][] finalMatrix) {
            this.order = order;
            this.finalMatrix = finalMatrix;
        }
    }

    public Result findOrder(int[][] matrix) {
        int order = 1;
        int[][] originalMatrix = new int[matrix.length][matrix[0].length];
        copymatrix(matrix, originalMatrix); // Keep a copy of the original matrix

        while (!isDivisibleBy99(matrix)) {
            addMatrix(matrix, originalMatrix); // Add original matrix each time
            order++;
        }
        return new Result(order,matrix);
    }

    public void initialize(int[][] matrix) {
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = rand.nextInt(97) + 1;
            }
        }
    }

    void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    void copymatrix(int[][] matrix, int[][] d) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                d[i][j] = matrix[i][j];
            }
        }
    }

    boolean isDivisibleBy99(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] % 99 != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    void addMatrix(int[][] matrix, int[][] originalMatrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] += originalMatrix[i][j];
            }
        }
    }
}

