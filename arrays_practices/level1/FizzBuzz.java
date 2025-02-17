package arrays_practices.level1;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number<=0){
            throw new RuntimeException("Invalid Number");
        }
        String[] array = new String[number+1];
        for (int i = 0; i <= number; i++) {
            if(i%3==0 && i%5==0){
                array[i] = "FizzBuzz";
            } else if (i%3==0) {
                array[i] = "Fizz";
            } else if (i%5==0) {
                array[i] = "Buzz";
            }
            else{
                array[i] = Integer.toString(i);
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
