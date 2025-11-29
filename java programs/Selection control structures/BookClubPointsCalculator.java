import java.util.Scanner;
public class BookClubPointsCalculator{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter number of books you purchased this month: ");
 int num = sc.nextInt();
 switch (num) {
 case 0:
 System.out.println("You earned 0 points");
 break;
 case 1:

 System.out.println("You earned 5 points");
 break;
 case 2:
 System.out.println("You earned 15 points");
 break;
 case 3:
 System.out.println("You earned 30 points");
 break;
 case 4:
 System.out.println("You earned 60 points");
 break;
 default:
 System.out.println(" Please enter 0–4.");
 }
 }
}