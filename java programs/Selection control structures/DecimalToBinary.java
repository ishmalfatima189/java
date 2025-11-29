import java.util.Scanner;
public class DecimalToBinary{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a decimal integer: ");
int decimal = input.nextInt();
if (decimal == 0) {
System.out.println("Binary value: 0");
return;
}
String binary = "";
int number = decimal;
while (number > 0) {
int remainder = number % 2;
binary = remainder + binary;
number = number / 2;
}
System.out.println("Binary value: " + binary);
}
}