package java_programming_elements.level2_problems;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int add = num1 + num2;
        int subtract = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + add + ", " + subtract + ", " + multiplication + ", " + division);
    }
}
