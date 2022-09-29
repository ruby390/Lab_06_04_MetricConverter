import java.util.Scanner;
public class metric {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Varibles
        String trash = "";
        double meterMeasurement = 0;
        // input
        System.out.println("Enter a measurement in meters:");
        if (in.hasNextDouble()) {
            meterMeasurement = in.nextDouble();
        } else {
            trash = in.nextLine();
            System.out.println("You said the measurement was " + trash);
            System.out.println("Run the program again enter a valid amount.");
            System.exit(0);
        }
        double milesMeasurement = meterMeasurement / 1609;
        double feetMeasurement = meterMeasurement * 3.281;
        double inchesMeasurement = meterMeasurement * 39.37;
        System.out.println(meterMeasurement + " in miles is " + milesMeasurement);
        System.out.println(meterMeasurement + " in feet is " + feetMeasurement);
        System.out.println(meterMeasurement + " in inches is " + inchesMeasurement);
    }
}