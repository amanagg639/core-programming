package arrays_practices.level1;

import java.util.Scanner;

public class ComparingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int numbers[] = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        for(int i : numbers){
            if(i>0){
                if(i%2==0) System.out.println("Even");
                else System.out.println("Odd");
            }
            else if(i==0) System.out.println("Zero");
            else System.out.println("Negative");
        }
        if(numbers[0]==numbers[n-1]) System.out.println("First and Last elements of array are equal");
        else if(numbers[0]>numbers[n-1]) System.out.println("First element is greater than the last element of an array");
        else System.out.println("Last element is greater than first element of an array");
    }
}
