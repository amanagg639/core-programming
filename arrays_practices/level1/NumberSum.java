package arrays_practices.level1;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        double numbers[] = new double[10];
        for (int i = 0; i < n; i++) {
            double num = sc.nextDouble();
            if(num <= 0)break;
            numbers[i] = num;
        }
        double sum = 0;
        for(double i : numbers){
            sum += i;
        }
        System.out.println(sum);

    }
}
