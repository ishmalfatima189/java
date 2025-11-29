import java.util.Scanner;
public class PatternPrinter{
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 char repeat;
 do {
 System.out.println("Choose a pattern to print (1 to 5):");
 System.out.println("1. Solid rectangle of stars");
 System.out.println("2. Left-aligned increasing stars");
 System.out.println("3. Right-aligned increasing stars");
 System.out.println("4. Centered pyramid of stars");
 System.out.println("5. Centered number pyramid");
 int choice = scanner.nextInt();
 switch (choice) {
 case 1:
 for (int i = 1; i <= 4; i++) {
 for (int j = 1; j <= 10; j++) {
 System.out.print("*");

}
 System.out.println();

}
 break;
 case 2:
 for (int i = 1; i <= 5; i++) {
 for (int j = 1; j <= i; j++) {
 System.out.print("*");

}
 System.out.println();

}
 break;
 case 3:
 for (int i = 1; i <= 5; i++) {
 for (int j = 5; j > i; j--) {
 System.out.print(" ");

}
 for (int k = 1; k <= i; k++) {
 System.out.print("*");

}
 System.out.println();

}
 break;
 case 4:
 for (int i = 1; i <= 5; i++) {
 for (int j = 5; j > i; j--) {
 System.out.print(" ");

}
 for (int k = 1; k <= (2 * i
- 1); k++) {
 System.out.print("*");

}
 System.out.println();

}
 break;
 case 5:
 for (int i = 1; i <= 5; i++) {
 for (int j = 5; j > i; j--) {
 System.out.print(" ");

}
 for (int k = 1; k <= (2 * i
- 1); k++) {
 System.out.print(i);

}

 System.out.println();
 }
 break;
 default:
 System.out.println("Invalid choice. Please select between 1 and 5.");
 }
 System.out.print("Do you want to print another pattern? (Y/N): ");
 repeat = scanner.next().charAt(0);
 } while (repeat == 'Y' || repeat == 'y');
 System.out.println("Program terminated.");
 scanner.close();
 }
}
