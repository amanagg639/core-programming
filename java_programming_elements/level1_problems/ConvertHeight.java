package java_programming_elements.level1_problems;

import java.util.Scanner;

public class ConvertHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heightCm = sc.nextDouble();
        double heightInch = (1/2.54)*heightCm;
        double heightFeet = (1/12)*heightInch;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + heightInch);
    }
}
