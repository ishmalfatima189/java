import java.util.Scanner;
public class SumOfNumbers {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter how many numbers: ");
 int N = input.nextInt();
 int sum = 0;
 for (int i = 1; i <= N; i++) {
 System.out.print("Enter number " + i + ": ");
 int num = input.nextInt();
 sum += num;
 }
 System.out.println("Sum = " + sum);
 }
}