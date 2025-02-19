package java_methods.level2;

import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfStudents = 10;
        int[] studentAge = new int[noOfStudents];
        System.out.println("Enter the Students age:");
        for(int i=0; i<noOfStudents; i++){
            studentAge[i] = sc.nextInt();
        }
        for(int i : studentAge){
            boolean canVote = canStudentVote(i);
            if(canVote){
                System.out.println("Student with age " + i + " can vote");
            }
            else System.out.println("Student with age " + i + " cannot vote");
        }

    }

    private static boolean canStudentVote(int age) {
        if(age>=18)return true;

        return false;
    }
}
