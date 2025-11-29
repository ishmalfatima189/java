import java.util.Scanner;
public class YearlyCalendar {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter year: ");
 int year = input.nextInt();
 System.out.print("Enter first day of the year (0=Sunday, 1=Monday, ..., 6=Saturday): ");
 int firstDay = input.nextInt();
 String[] months = {
 "January", "February", "March", "April", "May", "June",
 "July", "August", "September", "October", "November", "December"
 };
 int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
 daysInMonth[1] = 29; // February = 29 days
 }
 for (int m = 0; m < 12; m++) {
 System.out.println("\n\n " + months[m] + " " + year);
 System.out.println("Sun Mon Tue Wed Thu Fri Sat");

 for (int i = 0; i < firstDay; i++) {
 System.out.print(" ");
 }
 for (int day = 1; day <= daysInMonth[m]; day++) {
 System.out.printf("%3d ", day);
 if ((day + firstDay) % 7 == 0) {
 System.out.println();
 }
 }
 firstDay = (firstDay + daysInMonth[m]) % 7;
 System.out.println();
 }
 }

}