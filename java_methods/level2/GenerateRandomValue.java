package java_methods.level2;

public class GenerateRandomValue {
    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(4);
        double[]averageMinMax =  findAverageMinMax(randomNumbers);
        System.out.println("The Random Numbers are: ");
        for(int i : randomNumbers){
            System.out.println(i);
        }
        System.out.println("Average: " + averageMinMax[0]);
        System.out.println("Minimum Number: " + averageMinMax[1]);
        System.out.println("Maximum Number: " + averageMinMax[2]);
    }

    private static double[] findAverageMinMax(int[] randomNumbers) {
        double[]averageMinMax = new double[3];
        double min = 10000;
        double max = 0;
        double sum = 0;
        for(int i=0; i<randomNumbers.length; i++){
            sum += randomNumbers[i];
            if(randomNumbers[i]<min){
                min = randomNumbers[i];
            }
            if(randomNumbers[i]>max){
                max = randomNumbers[i];
            }
        }
        double average = sum/randomNumbers.length;
        averageMinMax[0] = average;
        averageMinMax[1] = min;
        averageMinMax[2] = max;
        return averageMinMax;
    }

    private static int[] generate4DigitRandomArray(int size) {
        int[] randomArray = new int[size];
        for(int i=0; i<size; i++){
            randomArray[i] = (int)(Math.random()*9000)+1000;
        }
        return randomArray;
    }
}
