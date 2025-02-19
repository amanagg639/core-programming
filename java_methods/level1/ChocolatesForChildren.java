package java_methods.level1;

import java.util.Scanner;

public class ChocolatesForChildren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of chocolates: ");
        int noOfChocolates = sc.nextInt();
        System.out.print("Enter Number of children: ");
        int noOfChildren = sc.nextInt();
        int []chocolates = findChocolates(noOfChocolates, noOfChildren);
        System.out.println("Each Student gets: " + chocolates[0] + " chocolates");
        System.out.println("Remaining chocolates are: " + chocolates[1]);

    }
    public static int[] findChocolates(int noOfChocolates, int noOfChildren){
        int chocolates[] = new int[2];
        chocolates[0] = noOfChocolates/noOfChildren;
        chocolates[1] = noOfChocolates-noOfChildren*chocolates[0];
        return chocolates;
    }
}
