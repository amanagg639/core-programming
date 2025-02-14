package java_programming_elements.level2_problems;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double baseInch = input.nextDouble();
        double heightInch = input.nextDouble();
        double areaInch = 0.5 * baseInch * heightInch;

        System.out.println("The area of the triangle is " + areaInch + " in square inches and " +  2.54*areaInch+ " in square centimeters");
    }
}
