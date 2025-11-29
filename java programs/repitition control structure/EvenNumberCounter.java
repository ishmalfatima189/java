import java.util.Scanner;
public class EvenNumberCounter {
 public static void main(String[] args) {

 Scanner input = new Scanner(System.in);
 int num;
 int evenCount = 0;
 System.out.println("Enter numbers (end with 0):");
 while (true) {
 num = input.nextInt();
 if (num == 0) {
 break;
 }
 if (num % 2 == 0) {
 evenCount++;
 }
 }
 System.out.println("Number of even elements = " + evenCount);
 }
}