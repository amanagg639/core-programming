package java_methods.level2;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = 5;
    int numbers[] = new int[n];
    System.out.println("Enter the Numbers ");
    for(int i = 0; i < n; i++) {
        numbers[i] = sc.nextInt();
    }
    for(int i : numbers){
        boolean isPositive = positiveOrNegative(i);
        if(isPositive){
            if(isEven(i)) System.out.println("Even");
            else System.out.println("Odd");
        }
        else if(i==0) System.out.println("Zero");
        else System.out.println("Negative");
    }
    if(compare(numbers[0], numbers[n-1])==0) System.out.println("First and Last elements of array are equal");
    else if(compare(numbers[0], numbers[n-1])==1) System.out.println("First element is greater than the last element of an array");
    else System.out.println("Last element is greater than first element of an array");
}

    private static boolean positiveOrNegative(int i) {
        if(i>0)return true;
        else return false;
    }
    private static boolean isEven(int i) {
        if(i%2==0)return true;
        else return false;
    }
    private static int compare(int i, int j) {
        if(i>j)return 1;
        else if(j>i) return -1;
        else return 0;
    }
}

