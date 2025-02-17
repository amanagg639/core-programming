package arrays_practices.level1;

import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double []heights = new double[11];
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
        }
        double sum = 0;
        for(double i : heights){
            sum += i;
        }
        double meanHeight = sum/11;
        System.out.println(meanHeight);
    }
}
