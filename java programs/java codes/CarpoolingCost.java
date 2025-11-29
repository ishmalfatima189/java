
import java.util.Scanner;
public class CarpoolingCost {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter total miles driven per day: ");
 double miles = sc.nextDouble();
 System.out.print("Enter cost per gallon of gasoline: ");
 double costPerGallon = sc.nextDouble();
 System.out.print("Enter average miles per gallon: ");
 double averageMiles = sc.nextDouble();
 System.out.print("Enter parking fees per day: ");
 double parkingFees = sc.nextDouble();
 System.out.print("Enter tolls per day: ");
 double tolls = sc.nextDouble();
 double fuelCost = (miles / averageMiles) * costPerGallon;
 double dailyCost = fuelCost + parkingFees + tolls;
 System.out.printf("Your daily driving cost is: Rs. %.2f%n", dailyCost);
 }
}