import java.util.Scanner;
public class TimeConverter{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of minutes that passed since midnight: ");
int N =sc.nextInt();
int hours =N / 60;
int minutes = N % 60;
System.out.println("The number of hours and minutes is :" + hours + " " + minutes );
}
}