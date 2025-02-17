package arrays_practices.level2;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of ");
        int noOfPerson = sc.nextInt();
        double weight[] = new double[noOfPerson];
        double height[] = new double[noOfPerson];
        double BMI[] = new double[noOfPerson];
        for (int i = 0; i < noOfPerson; i++) {
            System.out.print("Enter the weight of person in Kg " + (i+1) + ": ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter the height of person in cm " + (i+1) + ": ");
            height[i] = sc.nextDouble();
        }
        for (int i = 0; i < noOfPerson; i++) {
            double bmi = weight[i]/(height[i]*height[i])*10000;
            BMI[i] = bmi;
        }
        for (int i = 0; i < noOfPerson; i++) {
            System.out.println("weight of person " + (i+1) + ": " + weight[i]);
            System.out.println("height of person " + (i+1) + ": " + height[i]);
            System.out.println("BMI of person " + (i+1) + ": " + BMI[i]);
            if(BMI[i]<=18.4)
            System.out.println("Person " + (i+1) + " is Underweight" );
            else if(BMI[i]>=18.5 && BMI[i]<24.9)
                System.out.println("Person " + (i+1) + " is Normal" );
            else if(BMI[i]>=25.0 && BMI[i]<39.9)
                System.out.println("Person " + (i+1) + " is Overweight" );
            else System.out.println("Person " + (i+1) + " is Obese" );
        }

    }
}
