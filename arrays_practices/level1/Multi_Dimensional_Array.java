package arrays_practices.level1;

import java.util.Scanner;

public class Multi_Dimensional_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        int matrix[][] = new int[rows][column];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] array = new int[rows*column];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                array[index++] = matrix[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
