package java_programming_elements.level1_problems;

import java.util.Scanner;

public class MaximumHandshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        int maximumHandshakes = (numberOfStudents*(numberOfStudents-1))/2;
        System.out.println("number of possible handshakes is " + maximumHandshakes);
    }
}
