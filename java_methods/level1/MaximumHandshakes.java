package java_methods.level1;

import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfStudents = sc.nextInt();
        System.out.println("The total number of handshakes are " + totalHandshakes(noOfStudents));
    }
    private static int totalHandshakes(int noOfStudents){
        int totalHandshakes = (noOfStudents*(noOfStudents-1))/2;
        return totalHandshakes;
    }
}
