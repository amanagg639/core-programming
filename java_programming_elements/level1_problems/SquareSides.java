package java_programming_elements.level1_problems;

import java.util.Scanner;

public class SquareSides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perimeter = sc.nextDouble();
        double side = perimeter/4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
