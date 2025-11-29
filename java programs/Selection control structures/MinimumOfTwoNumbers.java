import java.util.Scanner;
public class MinimumOfTwoNumbers {
public static void main(String[ ] args){
Scanner sc = new Scanner (System.in);
System.out.print("Enter 1st integer : ");
int num1 = sc.nextInt();
System.out.print("Enter 2nd integer : ");
int num2 = sc.nextInt();

if( num1 < num2)
System.out.print("smaller number is : " + num1);
else
System.out.print("smaller number is : " + num2);
}
}