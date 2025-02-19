package java_methods.level2;

import java.util.Scanner;

public class UnitConverter {
    // Method To convert kilometers to miles and return the value
    public static double convertKmToMiles(double km) {
        // Convert km to miles
        double km2miles = 0.621371;
        double miles = km * km2miles;

        // return the value
        return miles;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for km
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();

        // Call the method to convert km to miles
        double miles = convertKmToMiles(km);

        // Display value in miles
        System.out.println("Distance in miles: " + miles);

        // Calling the Method again to convert km to miles and display it
        System.out.print("Enter the distance in miles: ");
        miles = sc.nextDouble();
        km = convertMilesToKm(miles);
        System.out.println("Distance in km: " + km);

        // Take input for meters
        System.out.print("Enter the height in meters: ");
        double meter = sc.nextDouble();

        // Call the method to convert km to miles
        double feet = convertMeterToFeet(meter);

        // Display value in miles
        System.out.println("Height in feet: " + feet);

        // Calling the Method again to convert km to miles and display it
        System.out.print("Enter the height in feet: ");
        feet = sc.nextDouble();
        meter = convertFeetToMeter(feet);
        System.out.println("Height in meters: " + meter);

        // Close the Scanner object
        sc.close();
    }

    private static double convertFeetToMeter(double feet) {
        double feet2Meter = 0.3048;
        double meter = feet*feet2Meter;
        return meter;
    }

    private static double convertMeterToFeet(double meter) {
        double meter2Feet = 3.28084;
        double feet = meter * meter2Feet;
        return  feet;
    }

    private static double convertMilesToKm(double miles) {
        // Convert km to miles
        double miles2Km = 1.60934;
        double km = miles * miles2Km;

        // return the value
        return km;
    }

}
