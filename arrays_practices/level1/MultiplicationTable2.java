package arrays_practices.level1;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int multiplicationTable[] = new int[4];
        for (int i = 0; i <= 4; i++) {
            int n = i+6;
            multiplicationTable[i] = number*n;
            System.out.println(number + "*" + n + "= " + multiplicationTable[i]);
        }
    }
}
