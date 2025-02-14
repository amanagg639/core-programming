package java_programming_elements.level1_problems;

public class Discount {
    public static void main(String[] args) {
        int studentFee = 125000;
        int discountPercent = 10;
        int discount = (10*125000)/100;
        int newAmount = studentFee-discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + newAmount);
    }
}
