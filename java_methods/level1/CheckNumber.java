package java_methods.level1;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();
        System.out.println(checkNumber(number));
    }
    private static int checkNumber(int number){
        if(number<0)return -1;
        else if(number>0)return 1;
        else return 0;
    }
}
