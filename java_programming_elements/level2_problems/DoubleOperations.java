package java_programming_elements.level2_problems;

import java.util.Scanner;

public class DoubleOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        Double operation1 = a + b * c;
        Double operation2 = a * b + c;
        Double operation3 = c + a / b;
        Double operation4 = a % b + c;

        System.out.println("The results of Double Operations are " + operation1 + ", " + operation2 + ", " + operation3 + " and " + operation4);
    }
}
