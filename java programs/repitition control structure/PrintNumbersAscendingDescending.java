import java.util.Scanner;
public class PrintNumbersAscendingDescending{
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter A: ");
 int A = input.nextInt();
 System.out.print("Enter B: ");
 int B = input.nextInt();
 if (A <= B) {
 for (int i = A; i <= B; i++) {
 System.out.print(i + " ");

 }
 } else {
 for (int i = A; i >= B; i--) {
 System.out.print(i + " ");
 }
 }
 }
}
