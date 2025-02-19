package java_methods.level1;

import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter Number2: ");
        int number2 = sc.nextInt();
        System.out.print("Enter Number3: ");
        int number3 = sc.nextInt();
        int []smallestAndLargest = findSmallestAndLargest(number1, number2, number3);
        System.out.println("Smallest Number: " + smallestAndLargest[0]);
        System.out.println("Largest Number: " + smallestAndLargest[1]);

    }
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int []smallestAndLargest = new int[2];
        if(number1<number2 && number1<number3){
            smallestAndLargest[0] = number1;
        }
        else{
            smallestAndLargest[0] = number2<number1 && number2<number3 ? number2 : number3;
        }
        if(number1>number2 && number1>number3){
            smallestAndLargest[1] = number1;
        }
        else{
            smallestAndLargest[1] = number2>number1 && number2>number3 ? number2 : number3;
        }
        return smallestAndLargest;
    }
}
