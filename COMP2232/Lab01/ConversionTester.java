import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class ConversionTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        String fahrenheit = "f";
        String celcius = "c";

        TemperatureConverter tempConvert = new TemperatureConverter();

        System.out.print("Please enter the temperature: ");
        String temp = scan.nextLine();

        System.out.print("Do you want to convert to F or C? Choose F or C: ");
        String choice = scan.nextLine(); 

        if (choice.equalsIgnoreCase(fahrenheit)) {
            System.out.println("From celcius to fahrenheit is: " + tempConvert.fahrenheitConverter(Double.valueOf(temp)));
        }
        else if (choice.equalsIgnoreCase(celcius)) {
            System.out.println("From fahrenheit to calcius is: " + tempConvert.calciusConverter(Double.valueOf(temp)));
        }
        
        else throw new IllegalArgumentException();
        scan.close();
        
    }
}
