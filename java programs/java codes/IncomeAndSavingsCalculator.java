import java.util.Scanner;
public class IncomeAndSavingsCalculator{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
final double payRate = 15.50;
System.out.println("Enter number of hours worked per week :");
double hoursperWeek = sc.nextDouble();
double grossIncome = payRate * hoursperWeek * 5;
double netIncome = grossIncome * (100 - 14 ) / 100 ;
double clothes = netIncome * 0.10;
double supplies = netIncome * 0.01;
double remaining = netIncome - (clothes + supplies);
double bonds = remaining * 0.25;
double parentsBonds = bonds * 0.50;
System.out.println("Income before tax : " + grossIncome);
System.out.println("Income after tax : " + netIncome);
System.out.println("Spent on clothes : " + clothes);
System.out.println("Spent on supplies : " + supplies);
System.out.println("Remaining income : " + remaining);
System.out.println("Spent on saving bonds : " + bonds);
System.out.println("Parents contribution : " + parentsBonds);
}
}