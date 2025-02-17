package arrays_practices.level2;

import java.util.Scanner;

public class StudentReportCardWithMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Students: ");
        int numberOfStudent = sc.nextInt();
        double marks[][] = new double[numberOfStudent][3];
        double percentage[] = new double[numberOfStudent];
        char grades[] = new char[numberOfStudent];
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("\nEnter the marks of Student " + (i+1) + "- ");
            while (true){
                System.out.print("Enter the Marks of Physics: ");
                marks[i][0] = sc.nextDouble();
                if(marks[i][0]<0){
                    System.out.println("Enter the positive value");
                    continue;
                }
                System.out.print("Enter the Marks of Chemistry: ");
                marks[i][1] = sc.nextDouble();
                if(marks[i][1]<0){
                    System.out.println("Enter the positive value");
                    continue;
                }
                System.out.print("Enter the Marks of Maths: ");
                marks[i][2] = sc.nextDouble();
                if(marks[i][2]<0){
                    System.out.println("Enter the positive value");
                    continue;
                }
                break;
            }
        }
        double totalMarks = 300;
        for (int i = 0; i < numberOfStudent; i++) {
            double studentTotalMarks = marks[i][0] + marks[i][1] + marks[i][2];
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
            System.out.println("Physics Marks: " + marks[i][0]);
            System.out.println("Chemistry Marks: " + marks[i][1]);
            System.out.println("Maths Marks: " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grades[i]);
        }
    }
}
