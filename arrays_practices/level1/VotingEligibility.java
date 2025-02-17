package arrays_practices.level1;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int []studentAge = new int[n];
        for (int i = 0; i < n; i++) {
            studentAge[i] = sc.nextInt();
        }
        for( int i : studentAge){
            if(i<=0){
                System.out.println("Invalid Age");
            }
            else if(i>=18){
                System.out.println("The student with the age " + i + " can vote.");
            }
            else{
                System.out.println("The student with the age " + i + " cannot vote.");
            }
        }
    }
}
