package java_methods.level1;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int sum = findSum(number);
        System.out.println("The sum of " + number + " natural numbers is " + sum);
    }
    private static int findSum(int number){
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        };
        return sum;
    }
}
