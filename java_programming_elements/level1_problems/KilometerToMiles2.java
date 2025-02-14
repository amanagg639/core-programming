package java_programming_elements.level1_problems;

import java.util.Scanner;

class KilometerToMiles2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceKm = sc.nextDouble();
        double distanceMiles = distanceKm*1.6;
        System.out.println("The total miles is " + distanceMiles + " mile for the given " + distanceKm + "Km") ;

    }
}
