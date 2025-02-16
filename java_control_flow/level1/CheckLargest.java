package java_control_flow.level1;

import java.util.Scanner;

public class CheckLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        System.out.print("Is the first number the largest? ");
        if (number1 > number2 && number1 > number3) {
            System.out.println("True");
        } else System.out.println("False");
        System.out.print("Is the second number the largest? ");
        if (number2 > number1 && number2 > number3) {
            System.out.println("True");
        } else System.out.println("False");
        System.out.print("Is the third number the largest? ");
        if (number3 > number1 && number3 > number1) {
            System.out.println("True");
        } else System.out.println("False");

    }
}