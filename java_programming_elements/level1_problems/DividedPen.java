package java_programming_elements.level1_problems;

public class DividedPen {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int penDistributedEach = pens / students;
        int remainingStudent = pens%students;
        System.out.println("The Pen Per Student is " + penDistributedEach + " and the remaining pen not distributed is " + remainingStudent);

    }
}
