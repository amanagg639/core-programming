package java_control_flow.level1;

import java.util.Scanner;

public class CheckSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        System.out.println("Is the first number the smallest?");
        if(number1<number2 && number1<number3){
            System.out.println("True");
        }
        else System.out.println("False");
    }
}
