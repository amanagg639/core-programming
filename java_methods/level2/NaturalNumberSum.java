package java_methods.level2;

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        if(number<=0){
            System.out.println("Please Enter the natural number");
        }
        else{
            int sumUsingRecursion = findSumUsingRecursion(number);
            int sumUsingFormula = findSumUsingFormula(number);
            if(sumUsingRecursion == sumUsingFormula){
                System.out.println("Method 1 and 2 giving same answer " + sumUsingFormula);
            }
            else System.out.println("Method 1 or 2 is incorrect");
        }
    }

    private static int findSumUsingFormula(int number) {
        return number*(number+1)/2;
    }

    private static int findSumUsingRecursion(int number) {

        if(number == 0)return 0;
        return number + findSumUsingRecursion(number-1);
    }
}
