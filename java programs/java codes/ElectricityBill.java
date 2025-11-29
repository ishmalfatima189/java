
import java.util.Scanner;
 public class ElectricityBill {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter number of units consumed from the solar system: ");
 int solarUnits = sc.nextInt();
 System.out.print("Enter number of units consumed from the electricity company: ");
 int companyUnits = sc.nextInt();
 int totalUnits = solarUnits + companyUnits;
 double billIfAllCompany = totalUnits * 60.0;
 double solarCost = solarUnits * 7.0;
 double companyCost = companyUnits * 60.0;
 double actualBill = solarCost + companyCost;
 double totalSavings = billIfAllCompany - actualBill;
 System.out.println("Bill if all units from company: Rs. " + billIfAllCompany);
 System.out.println("Actual bill (solar + company): Rs. " + actualBill);
 System.out.println("Total savings using solar: Rs. " + totalSavings);
 }
}