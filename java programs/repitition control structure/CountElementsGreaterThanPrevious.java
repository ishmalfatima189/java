import java.util.Scanner;
public class CountElementsGreaterThanPrevious{
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 int prev = input.nextInt();
 int count = 0;
 System.out.println("Enter numbers (end with 0):");
 while (true) {
 int current = input.nextInt();
 if (current == 0) {
 break;
 }
 if (current > prev) {

 count++;
 }
 prev = current; }
 System.out.println("Count = " + count);
 }
}
