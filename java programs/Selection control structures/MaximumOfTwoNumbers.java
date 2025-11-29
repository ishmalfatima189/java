import java.util.Scanner;
public class MaximumOfTwoNumbers{
public static void main(String[ ] args){
Scanner sc = new Scanner (System.in);
System.out.print("Enter 1st integer : ");
int num1 = sc.nextInt();
System.out.print("Enter 2nd integer : ");
int num2 = sc.nextInt();
if( num1 > num2)
System.out.print("greater number is : " + num1);
else
System.out.print("greater number is : " + num2);
}
}
