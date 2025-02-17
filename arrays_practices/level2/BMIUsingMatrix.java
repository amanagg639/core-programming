package arrays_practices.level2;

import java.util.Scanner;

public class BMIUsingMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of ");
        int noOfPerson = sc.nextInt();
        double personData[][] = new double[noOfPerson][3];
        String[] weightStatus = new String[noOfPerson];

        for (int i = 0; i < noOfPerson; i++) {
            while (true) {
                System.out.print("Enter the weight of person " + (i + 1) +" in Kg "+ ": ");
                personData[i][0] = sc.nextDouble();
                if(personData[i][0]<0){
                    System.out.println("Enter positive value");
                    continue;
                }
                System.out.print("Enter the height of person " + (i + 1) + " in cm " + ": ");
                personData[i][1] = sc.nextDouble();
                if(personData[i][1]<0){
                    System.out.println("Enter positive value");
                    continue;
                }
                break;
            }
        }
        for (int i = 0; i < noOfPerson; i++) {
            double bmi = personData[i][0]/(personData[i][1]*personData[i][1])*10000;
            personData[i][2] = bmi;
            if(personData[i][2]<=18.4)
                weightStatus[i] = "Underweight";
            else if(personData[i][2]>=18.5 && personData[i][2]<24.9)
                weightStatus[i] = "Normal";
            else if(personData[i][2]>=25.0 && personData[i][2]<39.9)
                weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }
        for (int i = 0; i < noOfPerson; i++) {
            System.out.println("weight of person " + (i+1) + ": " + personData[i][0]);
            System.out.println("height of person " + (i+1) + ": " + personData[i][1]);
            System.out.println("BMI of person " + (i+1) + ": " + personData[i][2]);
            System.out.println("Weight status of person " + (i+1) + ": " + weightStatus[i]);
        }
    }
}
