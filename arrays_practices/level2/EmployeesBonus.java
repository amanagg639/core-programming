package arrays_practices.level2;

import java.util.Scanner;

public class EmployeesBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfEmployee = 10;
        double[] salary = new double[noOfEmployee];
        int[] yearOfService = new int[noOfEmployee];
        double[] bonus = new double[noOfEmployee];
        double[] newSalary = new double[noOfEmployee];
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        for (int i = 0; i < 10; i++) {
            while (true){
                System.out.print("Enter the Salary of Employee " + (i+1) + ": ");
                salary[i] = sc.nextDouble();
                if(salary[i]<=0)continue;
                System.out.print("Enter the Year of Service of Employee " + (i+1) + ": ");
                yearOfService[i] = sc.nextInt();
                if(yearOfService[i]<=0)continue;
                break;
            }

        }
        for (int i = 0; i < noOfEmployee; i++) {
            double bonusPercentage = yearOfService[i] >= 5 ? 0.05 : 0.02;
            bonus[i] = salary[i]*bonusPercentage;
            newSalary[i] = bonus[i] + salary[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
            totalBonus += bonus[i];
        }
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

    }
}
