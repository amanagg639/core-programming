package java_methods.level1;

import java.util.Scanner;

public class ReminderAndQuotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor = sc.nextInt();
        int []remainderAndQuotient = findRemainderAndQuotient(number1, divisor);
        System.out.println("Reminder: " + remainderAndQuotient[0]);
        System.out.println("Quotient: " + remainderAndQuotient[1]);

    }
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int []remainderAndQuotient = new int[2];
        remainderAndQuotient[0] = number%divisor; //Using moduli operator (%) for reminder
        remainderAndQuotient[1] = number/divisor; //Using division operator (/) for quotient
        return remainderAndQuotient;
    }
}
