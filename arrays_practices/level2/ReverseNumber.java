package arrays_practices.level2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();
        int count = 0;
        int temp = number;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        int[] digits = new int[count];
        int index = 0;
        while (number>0){
            int lastDigit = number%10;
            digits[index++] = lastDigit;
            number /= 10;
        }
        System.out.print("Number in reverse order: ");
        for(int i : digits){
            System.out.print(i + " ");
        }
    }
}
