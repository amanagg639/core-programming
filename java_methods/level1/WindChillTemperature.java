package java_methods.level1;

import java.util.Scanner;

public class WindChillTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        double temperature = sc.nextInt();
        System.out.print("Enter wind speed: ");
        double windSpeed = sc.nextInt();
        double windChill = calculateWindChill(windSpeed, temperature);
        System.out.println("wind chill temperature is: " + windChill);
    }
    public static double calculateWindChill(double temperature, double windSpeed){
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }
}
