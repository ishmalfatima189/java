public class VehiclePlateNumber{
public static void main(String[] args) {
System.out.println("Format: 3 uppercase letters followed by 4 digits (e.g., ABC1234)");
System.out.println();
String plate = "";
for (int i = 0; i < 3; i++) {
char letter = (char) ('A' + Math.random() * 26);
plate += letter;
}
for (int i = 0; i < 4; i++) {
int digit = (int) (Math.random() * 10);
plate += digit;
}
System.out.println("Generated Vehicle Plate Number: " + plate);
}
}