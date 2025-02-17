package arrays_practices.level2;

import java.util.Scanner;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        while(temp>0){
            temp /= 10;
            count++;
        }
        int digits[] = new int[count];
        int index = 0;
        while(number>0){
            int lastDigit = number%10;
            digits[index++] = lastDigit;
            number /= 10;
        }
        for(int i=0; i<digits.length; i++){
            count = 1;
            if(digits[i] == -1)continue;
            for (int j = i+1; j < digits.length; j++) {
                if(digits[i] == digits[j]){
                   count++;
                   digits[j] = -1;
                }
            }
            System.out.println("Frequency of " + digits[i] + " is- " + count);
        }
    }
}
