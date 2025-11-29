import java.util.Scanner;
public class ZeroCounter {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
System.out.print("How many numbers do you want to enter? ");
 int N = input.nextInt();
 int count = 0;
 for (int i = 0; i < N; i++) {
System.out.print("Enter number " + i + ": ");
 int num = input.nextInt();
 if (num == 0) {
 count++;
 }
 }
 System.out.println("Number of zeros = " + count);
 }
}
