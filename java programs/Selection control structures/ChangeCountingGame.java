import java.util.Scanner;
public class ChangeCountingGame{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of pennies : ");
int pennies = sc.nextInt();
System.out.print("Enter number of nickels : ");
int nickels = sc.nextInt();
System.out.print("Enter number of dimes : ");
int dimes = sc.nextInt();
System.out.print("Enter number of quarters : ");
int quarters = sc.nextInt();
int totalValue = pennies + (nickels*5) + (dimes*10) + (quarters*25);
if( totalValue == 100 )
System.out.println("Congratulations! You win the game");
else if( totalValue >= 100)
System.out.println("Your amount is greater than one dollar");
else
System.out.println("Your amount is less than one dollar");
}
}