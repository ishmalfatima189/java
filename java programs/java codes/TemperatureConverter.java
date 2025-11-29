public class TemperatureConverter{
public static void main(String[] args){
 double Celsius = 32.0;
 double Farenheit = (9/5 * Celsius) + 32;
 double Kelvin = Celsius + 273.15;
 System.out.println("Temperature in celsius is: " + Celsius + "°C" );
 System.out.println("Temperature in farenheit is: " + Farenheit + "°F" );
 System.out.println("Temperature in kelvin is: " + Kelvin + " K" );
 }
}