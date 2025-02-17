package arrays_practices.level1;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number<0){
            throw new RuntimeException("Invalid Number");
        }
        int size = number / 2 + 1 ;
        int even[] = new int[size];
        int odd[] = new int[size];
        int i = 0, j = 0;
        for (int index = 1; index <= number ; index++) {
            if(index%2==0){
                even[i++] = index;
            }
            else{
                odd[j++] = index;
            }
        }
        System.out.println("Even Array");
        for (int k = 0; k < even.length; k++) {
            System.out.println(even[k]);
        }
        System.out.println("Odd Array");
        for (int k = 0; k < odd.length; k++) {
            System.out.println(odd[k]);
        }
    }
}
