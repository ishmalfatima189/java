import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String str = sc.nextLine();

        System.out.println(str.charAt(2)); // third character
        System.out.println(str.charAt(str.length() - 2)); // second last
        System.out.println(str.substring(0, 5)); // first five characters
        System.out.println(str.substring(0, str.length() - 2)); // all but last two
        System.out.println(str.chars()
                .filter(i -> i % 2 == 0).mapToObj(c -> String.valueOf((char)c))
                .reduce("", String::concat)); // even indices
        System.out.println(str.chars()
                .filter(i -> i % 2 != 0).mapToObj(c -> String.valueOf((char)c))
                .reduce("", String::concat)); // odd indices
        System.out.println(new StringBuilder(str).reverse().toString()); // reverse
        System.out.println(new StringBuilder(str).reverse()
                .toString().replaceAll(".(.?)", "$1")); // every second char reversed
        System.out.println(str.length()); // length
    }
}