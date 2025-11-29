public class laptopSavings{
public static void main(String[] args){
 int earning = 50000;
 int monthlyExpences = 37500;
 int laptopPrice = 100000;
 int monthlySavings = earning - monthlyExpences;
 int monthsRequired = laptopPrice / monthlySavings;
 System.out.println("Monthly savings: Rs. " + monthlySavings);
 System.out.println("Months required to buy laptop: " + monthsRequired);
 }
}