package java_programming_elements.level1_problems;

import java.util.Scanner;

public class FindPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unitPrice = sc.nextInt();
        int quantity = sc.nextInt();
        double totalPrice = unitPrice*quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);


    }
}
