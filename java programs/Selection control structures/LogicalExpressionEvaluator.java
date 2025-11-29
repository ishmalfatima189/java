public class LogicalExpressionEvaluator {
public static void main(String[ ] args){
int x= 10;
int y = 15;
int z = 20;
System.out.println("!(x > 10) = " + (!(x > 10)) );
System.out.println("(x <= 5 || y < 15) =" + (x <= 5 || y < 15));
System.out.println("((x != 5 ) && (y != z))= " + ((x != 5 ) && (y != z)));
System.out.println("(x >= z || (x + y >= z))= " + (x >= z || (x + y >= z)));
System.out.println("((x <= y - 2) && (y >= z) || (z - 2 != 20))=" + ((x <= y - 2) && (y >= z) ||
(z - 2 != 20)));
}
}