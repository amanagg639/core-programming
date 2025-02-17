package arrays_practices.level1;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int maxFactor = 5;
        int factor[] = new int[maxFactor];
        int index = 0;
        for (int i = 1; i < number; i++) {
            if(number%i==0){
            if(index==maxFactor){
                maxFactor *= 2;
                int[] tempArr = new int[maxFactor];
                System.arraycopy(factor, 0, tempArr, 0, factor.length);
                factor = tempArr;
            }
                factor[index++] = i;
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.println(factor[i]);
        }
    }
}
