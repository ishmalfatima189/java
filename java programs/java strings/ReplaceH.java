import java.util.Scanner;

public class ReplaceH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String str = sc.nextLine();

        int first = str.indexOf('h');
        int last = str.lastIndexOf('h');

        String middle = str.substring(first + 1, last).replace('h', 'H');
        String result = str.substring(0, first + 1) + middle + str.substring(last);
        System.out.println(result);
    }
}