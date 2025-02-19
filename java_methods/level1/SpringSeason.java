package java_methods.level1;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month: ");
        int month = sc.nextInt();
        System.out.print("Enter Day: ");
        int day = sc.nextInt();
        if(checkSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        }
        else System.out.println("Not a Spring Season");
    }
    private static boolean checkSpringSeason(int month, int day){
        if(month==3 && day>=20 || month==6 && day<=20 || month>3 && month<6)return true;
        else return false;
    }
}
