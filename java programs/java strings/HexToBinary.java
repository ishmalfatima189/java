import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hex = sc.next().toUpperCase();

        if (hex.matches("[0-9A-F]")) {
            int decimal = Integer.parseInt(hex, 16);
            String binary = Integer.toBinaryString(decimal);
            System.out.println("The binary value is " + binary);
        } else {
            System.out.println(hex + " is an invalid input");
        }
    }
}