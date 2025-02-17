package arrays_practices.level1;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int multiplicationTable[] = new int[10];
        for (int i = 1; i <= 10; i++) {
             multiplicationTable[i] = number*i;
            System.out.println(number + "*" + i + "= " + multiplicationTable[i]);
        }
    }
}