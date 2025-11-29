
import java.util.Scanner;
public class ReverseANumber {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a five-digit number: ");
 int num = sc.nextInt();
 int d1 = num / 10000;
 int d2 = (num / 1000) % 10;
 int d3 = (num / 100) % 10;
 int d4 = (num / 10) % 10;
 int d5 = num % 10;
 int reverse = d5 * 10000 + d4 * 1000 + d3 * 100 + d2 * 10 + d1;
 System.out.println("The reverse number is: " + reverse);
 }
}