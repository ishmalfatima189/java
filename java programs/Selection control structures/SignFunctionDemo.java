import java.util.Scanner;
public class SignFunctionDemo{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter an integer : ");
int X = sc.nextInt();
if( X > 0 )
System.out.println("1");
else if( X < 0 )
System.out.println("-1");
else
System.out.println("0");
}
}