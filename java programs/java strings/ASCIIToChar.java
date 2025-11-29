import java.util.Scanner;

public class ASCIIToChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int ascii = sc.nextInt();
        System.out.println("The character for ASCII code " + ascii + " is " + (char) ascii);
    }
}