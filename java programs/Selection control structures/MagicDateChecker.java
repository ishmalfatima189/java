import java.util.Scanner;
public class MagicDateChecker{
public static void main(String[ ] args){
Scanner sc = new Scanner (System.in);
System.out.print("Enter month in numeric form : ");
int month = sc.nextInt();
System.out.print("Enter day in numeric form : ");
int day = sc.nextInt();
System.out.print("Enter two-digit year : ");
int year = sc.nextInt();
if(month * day == year )
System.out.println("The date is magic.");
else
System.out.println("Date is not magic:");
}
}