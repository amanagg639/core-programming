package java_methods.level3;

import java.util.Random;
import java.util.Scanner;

public class StudentsMarks {

    // Method to generate random scores for PCM
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = (int)(Math.random()*90)+10; // Physics (50-100)
            scores[i][1] = (int)(Math.random()*90)+10; // Chemistry (50-100)
            scores[i][2] = (int)(Math.random()*90)+10; // Math (50-100)
        }

        return scores;
    }

    // Method to compute total, average, and percentage
    public static double[][] computeResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method to display scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "    \t  " + scores[i][0] + "    \t  " + scores[i][1] + "    \t  " + scores[i][2] + "    \t  "
                    + (int) results[i][0] + "    \t  " + results[i][1] + "    \t  " + results[i][2] + "%");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] results = computeResults(scores);
        displayScorecard(scores, results);

        scanner.close();
    }
}

