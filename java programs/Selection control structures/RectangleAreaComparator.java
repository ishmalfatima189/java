import java.util.Scanner;
public class RectangleAreaComparator {
public static void main(String[ ] args){

Scanner sc = new Scanner (System.in);
System.out.print("Enter length of 1st rectangle : ");
int length1 = sc.nextInt();
System.out.print("Enter width of 1st rectangle : ");
int width1 = sc.nextInt();
System.out.print("Enter length of 2nd rectangle : ");
int length2 = sc.nextInt();
System.out.print("Enter width of 2nd rectangle : ");
int width2 = sc.nextInt();
int area1 = length1 * width1;
int area2 = length2 * width2;
if(area1 > area2)
System.out.println("Area of 1st triangle is greater.");
else if(area1 < area2)
System.out.println("Area of 2nd triangle is greater.");
else
System.out.println("Area of both triangles is same.");
}
}