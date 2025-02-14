package java_programming_elements.level1_problems;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is " + area + " in square inches and " +  2.54*area + " in square centimeters");
    }
}
