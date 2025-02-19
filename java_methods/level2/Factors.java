package java_methods.level2;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        int factors[] = findFactors(number);
        int factorSum = findFactorSum(factors);
        int factorProduct = findFactorProduct(factors);
        int factorSquareSum = findFactorSquareSum(factors);
        System.out.println("Factors of " + number + " are :");
        for (int i : factors){
            System.out.print(i + " ");
        }
        System.out.println("\nSum of factors of " + number + " is :" + factorSum);
        System.out.println("Product of factors of " + number + " is :" + factorProduct);
        System.out.println("Sum of factors square of " + number + " is :" + factorSquareSum);
    }

    private static int findFactorSquareSum(int[] factors) {
        int squareSum = 0;
        for(int i : factors){
            squareSum += Math.pow(i, 2);
        }
        return squareSum;
    }

    private static int findFactorProduct(int[] factors) {
        int product = 1;
        for(int i : factors){
            product *= i;
        }
        return product;
    }

    private static int findFactorSum(int[] factors) {
        int sum = 0;
        for(int i : factors){
            sum += i;
        }
        return sum;
    }

    private static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i < number; i++) {
            if(number%i==0)count++;
        }
        int []factors = new int[count];
        int index = 0;
        for (int i = 1; i < number; i++) {
            if(number%i==0){
                factors[index++] = i;
            }
        }
        return factors;
    }
}
