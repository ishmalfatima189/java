import java.util.Scanner;

public class GreatCircleDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double lat1 = sc.nextDouble();
        double lon1 = sc.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double lat2 = sc.nextDouble();
        double lon2 = sc.nextDouble();

        double radius = 6371.01; // Earth's radius in km

        // Convert degrees to radians
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        // Great circle distance formula
        double distance = radius * Math.acos(
                Math.sin(lat1) * Math.sin(lat2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2)
        );

        System.out.println("The distance between the two points is " + distance + " km");
    }
}