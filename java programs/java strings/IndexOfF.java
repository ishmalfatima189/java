import java.util.Scanner;

public class IndexOfF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String str = sc.nextLine();

        int first = str.indexOf('f');
        int last = str.lastIndexOf('f');

        if (first != -1) {
            if (first == last) {
                System.out.println(first);
            } else {
                System.out.println(first + " " + last);
            }
        }
    }
}