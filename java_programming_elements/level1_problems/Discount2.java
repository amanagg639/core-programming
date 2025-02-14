package java_programming_elements.level1_problems;

import java.util.Scanner;

public class Discount2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int studentFee = sc.nextInt();
        int discountPercent = sc.nextInt();
        int discount = (discountPercent * studentFee) / 100;
        int newAmount = studentFee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + newAmount);

    }
}