import java.util.Scanner;

public class CapitalizeTask {
    public static String capitalize(String word) {
        if (word.length() == 0) return word;
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of lowercase words: ");
        String line = sc.nextLine();

        String result = "";
        String word = "";
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch == ' ') {
                result += capitalize(word) + " ";
                word = "";
            } else {
                word += ch;
            }
        }
        result += capitalize(word); // capitalize last word
        System.out.println(result);
    }
}