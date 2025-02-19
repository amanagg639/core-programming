package java_methods.level2;

import java.util.Scanner;

public class UnitConverter2 {
    // Method To convert kilometers to miles and return the value

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for yards
        System.out.print("Enter the Distance in yards: ");
        double yard = sc.nextDouble();

        // Call the method to convert yards to feet
        double feet = convertYardsToFeet(yard);

        // Display value in feet
        System.out.println("Distance in feet: " + feet);

        System.out.print("Enter the distance in feet: ");
        feet = sc.nextDouble();
        yard = convertFeetToYard(feet);
        System.out.println("Distance in yards: " + yard);

        // Take input for meters
        System.out.print("Enter the distance in meters: ");
        double meter = sc.nextDouble();

        // Call the method to convert km to miles
        double inches = convertMeterToInches(meter);

        // Display value in miles
        System.out.println("Distance in inches: " + inches);

        // Calling the Method again to convert km to miles and display it
        System.out.print("Enter the distance in inches: ");
        inches = sc.nextDouble();
        meter = convertInchesToMeter(inches);
        System.out.println("distance in meters: " + meter);

        System.out.print("Enter the distance in inches: ");
        inches = sc.nextDouble();
        double centimeter = convertInchesToCentimeter(inches);
        System.out.println("distance in centimeters: " + centimeter);

        // Close the Scanner object
        sc.close();
    }

    private static double convertInchesToCentimeter(double inches) {
        double inches2Centimeter = 2.54;
        double cm = inches*inches2Centimeter;
        return cm;
    }

    private static double convertFeetToYard(double feet) {
        double feet2Yard = 0.333333;
        double yard = feet*feet2Yard;
        return yard;
    }

    private static double convertYardsToFeet(double yard) {
        double yard2Feet = 3;
        double feet = yard*yard2Feet;
        return feet;
    }

    private static double convertInchesToMeter(double inches) {
        double Inches2Meter = 0.0254;
        double meter = inches*Inches2Meter;
        return meter;
    }

    private static double convertMeterToInches(double meter) {
        double meter2Inches = 39.3701;
        double inches = meter * meter2Inches;
        return  inches;
    }


}
