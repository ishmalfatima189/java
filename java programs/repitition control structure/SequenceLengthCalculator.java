import java.util.Scanner;
public class SequenceLengthCalculator {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 int count = 0;
 int num;
 System.out.println("Enter numbers (enter 0 to stop):");
 while (true) {
 num = input.nextInt();
 if (num == 0) {
 break;
 }
 count++;
 }
 System.out.println("Length of sequence = " + count);
 }
}