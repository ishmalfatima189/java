import java.util.Scanner;
public class TicketSalesCalculator{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("How many tickets were sold for class A :");
int classA = sc.nextInt();
System.out.println("How many tickets were sold for class B :");
int classB = sc.nextInt();
System.out.println("How many tickets were sold for class C :");
int classC = sc.nextInt();
System.out.println("How many tickets were sold for class D :");
int classD = sc.nextInt();
int incomeA = classA * 20;
int incomeB = classB * 15;
int incomeC = classC * 10;
int incomeD = classD * 5;
int totalIncome = incomeA + incomeB + incomeC + incomeD;
System.out.println("Income for class A : $" + incomeA);
System.out.println("Income for class B : $" + incomeB);
System.out.println("Income for class C : $" + incomeC);
System.out.println("Income for class D : $" + incomeD);
System.out.println("Total Income : $ " + totalIncome);
}
}
