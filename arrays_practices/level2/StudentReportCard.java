package arrays_practices.level2;

import java.util.Scanner;

public class StudentReportCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Students: ");
        int numberOfStudent = sc.nextInt();
        double physicsMarks[] = new double[numberOfStudent];
        double chemistryMarks[] = new double[numberOfStudent];
        double mathsMarks[] = new double[numberOfStudent];
        double percentage[] = new double[numberOfStudent];
        char grades[] = new char[numberOfStudent];
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("\nEnter the marks of Student " + (i+1) + "- ");
            while (true){
                System.out.print("Enter the Marks of Physics: ");
                physicsMarks[i] = sc.nextDouble();
                if(physicsMarks[i]<0){
                    System.out.println("Enter the positive value");
                    continue;
                }
                System.out.print("Enter the Marks of Chemistry: ");
                chemistryMarks[i] = sc.nextDouble();
                if(chemistryMarks[i]<0){
                    System.out.println("Enter the positive value");
                    continue;
                }
                System.out.print("Enter the Marks of Maths: ");
                mathsMarks[i]= sc.nextDouble();
                if(mathsMarks[i]<0){
                    System.out.println("Enter the positive value");
                    continue;
                }
                break;
            }
        }
        double totalMarks = 300;
        for (int i = 0; i < numberOfStudent; i++) {
            double studentTotalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentage[i] = (studentTotalMarks/totalMarks)*100;
            if(percentage[i]>=80)grades[i] = 'A';
            else if(percentage[i]>=70) grades[i] = 'B';
            else if(percentage[i]>=60) grades[i] = 'C';
            else if(percentage[i]>=50) grades[i] = 'D';
            else if(percentage[i]>=40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("\nReport of Student " + (i+1) + "- ");
            System.out.println("Physics Marks: " + physicsMarks[i]);
            System.out.println("Chemistry Marks: " + chemistryMarks[i]);
            System.out.println("Maths Marks: " + mathsMarks[i]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grades[i]);
        }
    }
}
