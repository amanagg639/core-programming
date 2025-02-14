package java_programming_elements.level2_problems;

import java.util.Scanner;

public class ConvertDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceInFeet = sc.nextDouble();
        double distanceInYard = distanceInFeet/3;
        double distanceInMile = distanceInYard/1760;
        System.out.println("The distance in feet is " + distanceInFeet + " while in yard is " + distanceInYard + " and distance in miles is " + distanceInMile);
    }
}
