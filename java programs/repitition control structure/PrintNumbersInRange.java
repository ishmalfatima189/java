import java.util.Scanner;
public class PrintNumbersInRange{
public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter A: ");
 int A = input.nextInt();
 System.out.print("Enter B: ");
 int B = input.nextInt();
 for (int i = A; i <= B; i++) {
 System.out.print(i + " ");
 }
 }
}
