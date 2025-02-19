package java_methods.level1;

import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sides of Triangular Park");
        System.out.print("Side 1: ");
        double side1 = sc.nextDouble();
        System.out.print("Side 2: ");
        double side2 = sc.nextDouble();
        System.out.print("Side 3: ");
        double side3 = sc.nextDouble();
        double totalDistance = 5;
        System.out.printf("The person need to do %.2f number of rounds to complete 5km run" , findNumberOfRounds(side1, side2, side3, totalDistance));
    }
    private static double findNumberOfRounds(double side1, double side2, double side3, double totalDistance){
        double perimeter = side1+side2+side3;
        double numberOfRounds = (totalDistance * 1000 )/perimeter;
        return numberOfRounds;
    }
}
