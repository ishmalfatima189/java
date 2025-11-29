import java.util.Scanner;
public class ClassroomDeskCalculator{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of students in first classroom:");
int A = sc.nextInt();
System.out.println("Enter number of students in second classroom:");
int B = sc.nextInt();
System.out.println("Enter number of students in third classroom:");
int C = sc.nextInt();
int desksA = A / 2 + A % 2;
int desksB = B / 2 + B % 2;
int desksC = C / 2 + C % 2;
int totalDesks = desksA +desksB +desksC;
System.out.println("Smallest possible number of desks is:" +
totalDesks);
}
}