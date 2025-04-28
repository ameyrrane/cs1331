import java.util.Scanner;

public class FahrenheitToCelsiusPrintf {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fahrenheit value: ");

        int temperatureF = input.nextInt();
        

        System.out.print("What is the day of the week? ");

        String day = input.next();

        System.out.print("Enter your prefered Celsius label: ");

        String typeC = input.next() + ":";

        

        double temperatureC = (5.0/9) * (temperatureF - 32);

        String fahrenheitOutput = String.format("%s Fahrenheit: %d", day, temperatureF );

        String celsiusOutput = String.format("%s %-11s %,.1f", day, typeC, temperatureC);

        System.out.println(fahrenheitOutput);

        System.out.println(celsiusOutput);
    }
}
