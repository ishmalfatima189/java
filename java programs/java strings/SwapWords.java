import java.util.Scanner;

public class SwapWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();

        String[] words = input.split(" ");
        System.out.println(words[1] + " " + words[0]);
    }
}