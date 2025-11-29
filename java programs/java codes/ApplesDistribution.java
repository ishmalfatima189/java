import java.util.Scanner;
public class ApplesDistribution{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Each number of students:");
int N = sc.nextInt();
System.out.println("Each number of apples:");
int K = sc.nextInt();
int applesperStudent;
applesperStudent = K/N;
int remaining ;
remaining = K%N;
System.out.println("Each student get apples:" + applesperStudent);
System.out.println("Apples left in the basket:" + remaining);
}
}