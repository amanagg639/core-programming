package arrays_practices.level2;

import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        while(number>0){
            int lastDigit = number%10;
            digits[index++] = lastDigit;
            number /= 10;
        }
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < index; i++) {
            largest = Math.max(digits[i], largest);
        }
        for(int i : digits){
            if(i>secondLargest && i<largest){
                secondLargest = i;
            }
        }
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }
}
