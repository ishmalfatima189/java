import java.util.Scanner;
public class EqualNumbersChecker {
public static void main(String[ ] args){
Scanner sc = new Scanner (System.in);
System.out.print("Enter interger1 : ");
int num1 = sc.nextInt();
System.out.print("Enter interger2 : ");
int num2 = sc.nextInt();

System.out.print("Enter interger3 : ");
int num3 = sc.nextInt();
if (num1 == num2 && num2== num3)
System.out.println("3");
else if (num1 == num2)
System.out.println("2");
else if (num1== num3)
System.out.println("2");
else if (num2 == num3)
System.out.println("2");
else
System.out.println("0");
}
}