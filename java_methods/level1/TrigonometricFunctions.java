package java_methods.level1;

import java.util.Scanner;

public class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Angle in Degrees: ");
        double angle = sc.nextInt();
        double []result = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);
    }
    public static double[] calculateTrigonometricFunctions(double angle){
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        return new double[]{sin, cos, tan};
    }
}

