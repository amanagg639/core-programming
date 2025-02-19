package java_methods.level2;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();
        double []root = findRoot(a, b, c);
        for(double i : root){
            System.out.println("root of equation ax^2 + bx + c is " + i);
        }

    }

    private static double[] findRoot(int a, int b, int c) {
        double delta = Math.pow(b, 2) + 4 * a * c;
        if(delta>0){
            double root1 = (-b + Math.sqrt(delta))/(2*a);
            double root2 = (-b - Math.sqrt(delta))/(2*a);
            return  new double[]{root1, root2};
        }
        else if(delta==0){
            double root = -b/(2*a);
            return new double[]{root};
        }
        else return new double[]{};
    }

}
