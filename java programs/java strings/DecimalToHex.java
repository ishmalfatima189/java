import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int dec = sc.nextInt();

        if (dec >= 0 && dec <= 15) {
            System.out.println("The hex value is " + Integer.toHexString(dec).toUpperCase());
        } else {
            System.out.println(dec + " is an invalid input");
        }
    }
}