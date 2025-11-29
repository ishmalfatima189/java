import java.util.Scanner;
public class MilkCartonPlanner{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
final double cartonCapacity =3.78;
final double onelitermilkCost = 0.38;
final double profitperCarton = 0.27;
System.out.println("Enter total amount of milk produced in the morning: ");
double milkProduced = sc.nextDouble();
int cartons =( int)Math.round(milkProduced / cartonCapacity);
double cost = milkProduced * onelitermilkCost;
double profit = cartons * profitperCarton;
System.out.println("The number of cartons needed is : " + cartons);
System.out.println("The cost of producing milk is : " + cost);
System.out.println("The profit of producing milk is : " + profit);
}
}