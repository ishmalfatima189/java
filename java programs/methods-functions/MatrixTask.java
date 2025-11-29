import java.util.Scanner;

public class MatrixTask {
    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {          // row loop
            for (int j = 0; j < n; j++) {      // column loop
                int num = (int)(Math.random() * 2); // 0 or 1
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printMatrix(n);
    }
}