package Day9.Challenge7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        //1. Initialize a 2D matrix with values.
        int[][] matrix = {
                {21, 47, 313},
                {666, 777, 101},
                {404,500,9}
        };
        //2. Print the matrix.
        System.out.println(Arrays.deepToString(matrix));
        //3. Find and print the sum of all elements in the matrix.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
                sum += matrix[i][j];
            }
        }
        System.out.println("The sum of all matrix elements: " + sum);
        System.out.println(Arrays.deepToString(matrix));
        //4. Transpose the matrix (swap rows with columns) and print the result.
        int [][] transposedMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposedMatrix[j][i]=matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(transposedMatrix));
    }
}