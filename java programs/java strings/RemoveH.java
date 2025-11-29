import java.util.Scanner;

public class RemoveH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String str = sc.nextLine();

        int first = str.indexOf('h');
        int last = str.lastIndexOf('h');

        String result = str.substring(0, first) + str.substring(last + 1);
        System.out.println(result);
    }
}