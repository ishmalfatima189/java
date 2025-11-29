import java.util.Scanner;
public class IndexOfMax{
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 int index = 0;
 int maxIndex = 0;
 int max = Integer.MIN_VALUE;
 int num;
 System.out.println("Enter numbers (end with 0):");
 while (true) {
 num = input.nextInt();
 if (num == 0) {
 break;
 }
 index++;
 if (num > max) {
 max = num;
 maxIndex = index; // store position of first max
 }
 }
 System.out.println("Index of first maximum = " + maxIndex);
 }
}
