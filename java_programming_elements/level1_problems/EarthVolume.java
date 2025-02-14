package java_programming_elements.level1_problems;

public class EarthVolume {
    public static void main(String[] args) {
        int radius = 6378;
        double volumeKm = (4/3) * Math.PI * radius * radius * radius;
        double volumeMiles = 1.6*volumeKm;
        System.out.println("The volume of earth is cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
