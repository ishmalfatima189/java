import java.util.Scanner;
public class AreaAndPerimeter{
public static void main(String [ ] args){
 Scanner sc = new Scanner (System.in);
int width;
int length;
int area;
int perimeter;
System.out.print("Enter the width: " );
width = sc.nextInt ();
System.out.println();
System.out.print("Enter the length: ");
length = sc.nextInt ();
System.out.println();
area = length * width;
System.out.println ( "Area = " +area);
perimeter = 2 * (length + width);
System.out.println ( "Perimeter = " +perimeter);
}
}