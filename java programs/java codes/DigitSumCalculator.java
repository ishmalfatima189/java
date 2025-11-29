import java.util.Scanner;
public class DigitSumCalculator{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number between 0 and 1000 :");
int num = sc.nextInt();
int digit1 = num % 10;
int digit2 =( num /10) %10;
int digit3 = (num / 100)%10;
int digit4 =(num /1000) %10;
int sum = digit1 + digit2 + digit3 + digit4 ;
System.out.println("The sum of digits is : " + sum);
}
}