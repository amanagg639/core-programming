package java_control_flow.level1;

import java.util.Scanner;

public class CheckDivisiblity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean flag = number%5==0 ? true : false;
        System.out.println("Is the number " + number + " divisible by 5?");
        if(flag){
            System.out.println("True");
        }
        else System.out.println("False");

    }
}
