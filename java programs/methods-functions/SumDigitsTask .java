public class SumDigitsTask {
    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long number = sc.nextLong();
        System.out.println("Sum of digits: " + sumDigits(number));
    }
}