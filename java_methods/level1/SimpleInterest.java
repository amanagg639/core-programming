package java_methods.level1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time: ");
        int time = sc.nextInt();
        double simpleInterest = findSimpleInterest(principal, rate, time);
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " +  principal + ", Rate of Interest " + rate + " and Time " + time);

    }
    public static double findSimpleInterest(double principal, double rate, double time){
        double simpleInterest = principal*rate*time/100;
        return  simpleInterest;
    }
}
