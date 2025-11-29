import java.util.Scanner;
public class MaxInSequence{
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 int num;
 int max = Integer.MIN_VALUE;
 System.out.println("Enter numbers (end with 0):");
 while (true) {
 num = input.nextInt();
 if (num == 0) {
 break;
 }
 if (num > max) {
 max = num;
 }
 }
 System.out.println("Maximum = " + max);
 }
}