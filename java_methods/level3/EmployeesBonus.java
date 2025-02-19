package java_methods.level3;

import java.util.Random;

public class EmployeesBonus {

    // Method to generate salary and years of service
    public static int[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        int[][] data = new int[numEmployees][2];

        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 10000 + random.nextInt(90000); // Salary (10,000 - 99,999)
            data[i][1] = random.nextInt(11); // Years of service (0-10)
        }

        return data;
    }

    // Method to compute new salary and bonus
    public static double[][] computeBonus(int[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] results = new double[numEmployees][2];

        for (int i = 0; i < numEmployees; i++) {
            double bonusRate = (employeeData[i][1] > 5) ? 0.05 : 0.02;
            double bonus = employeeData[i][0] * bonusRate;
            double newSalary = employeeData[i][0] + bonus;

            results[i][0] = Math.round(newSalary * 100.0) / 100.0; // Rounding to 2 decimal places
            results[i][1] = Math.round(bonus * 100.0) / 100.0; // Rounding to 2 decimal places
        }

        return results;
    }

    // Method to display salary details and total calculations
    public static void displaySalaryDetails(int[][] employeeData, double[][] results) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("Emp\tOld Salary\tYears Service\tNew Salary\tBonus");
        for (int i = 0; i < employeeData.length; i++) {
            totalOldSalary += employeeData[i][0];
            totalNewSalary += results[i][0];
            totalBonus += results[i][1];

            System.out.println((i + 1) + "\t" + employeeData[i][0] + "\t" + employeeData[i][1] + "\t\t"
                    + results[i][0] + "\t" + results[i][1]);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Total\t" + totalOldSalary + "\t\t\t" + totalNewSalary + "\t" + totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        int[][] employeeData = generateEmployeeData(numEmployees);
        double[][] results = computeBonus(employeeData);
        displaySalaryDetails(employeeData, results);
    }
}
