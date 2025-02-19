package java_methods.level2;

import java.util.Scanner;

public class UnitConverter3 {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = convertFahrenheitToCelsius(fahrenheit);

        System.out.println("value in celsius: " + celsius);

        System.out.print("Enter the value in celsius: ");
        celsius = sc.nextDouble();
        fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println("value in fahrenheit: " + fahrenheit);

        System.out.print("Enter the value in pounds: ");
        double pounds = sc.nextDouble();

        double kg = convertPoundToKg(pounds);

        // Display value in kg
        System.out.println("value in kg: " + kg);


        System.out.print("Enter the value in kg: ");
        kg = sc.nextDouble();
        pounds = convertKgToPounds(kg);
        System.out.println("value in pounds: " + pounds);

        System.out.print("Enter the value in gallons: ");
        double gallon = sc.nextDouble();
        double liters = convertGallonToLiters(gallon);
        System.out.println("value in liters: " + liters);

        System.out.print("Enter the value in liters: ");
        liters = sc.nextDouble();
        gallon = convertLitersToGallon(liters);
        System.out.println("value in gallon: " + gallon);


        // Close the Scanner object
        sc.close();
    }

    private static double convertLitersToGallon(double liters) {
        double liter2Gallon = 0.264172;
        double gallon = liters*liter2Gallon;
        return gallon;
    }

    private static double convertGallonToLiters(double gallon) {
        double gallon2liters = 3.78541;
        double liters = gallon*gallon2liters;
        return liters;
    }

    private static double convertKgToPounds(double kg) {
        double kg2Pound = 2.20462;
        double pound = kg*kg2Pound;
        return pound;
    }

    private static double convertPoundToKg(double pounds) {
        double pounds2Kg = 0.453592;
        double kg = pounds*pounds2Kg;
        return kg;
    }

    private static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius*9/5)+32;
        return celsius2fahrenheit;
    }

    private static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2Celsius = (fahrenheit-32) * 5 / 9;
        return fahrenheit2Celsius;
    }

}
