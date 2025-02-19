package java_methods.level2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if(year<1582){
            System.out.println("Please Enter the year greater than 1582");
        }
        else{
            boolean leapYear = checkLeapYear(year);
            if(leapYear){
                System.out.println("this is leap year");
            }
            else System.out.println("This is not a leap year");
        }
    }

    private static boolean checkLeapYear(int year) {
        if((year%4==0 && year%100!=0) || year%400==0){
            return true;
        }
        return false;
    }
}
