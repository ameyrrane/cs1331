import java.util.Scanner;

public class InputValidation {

    public static void main(String[] args) {
        // Ask user to for temperature in Fahrenheit and keep asking until user enters a valid number

        final int MAX_TEMP = 140;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        int temperatureF = input.nextInt();

        
        while (temperatureF > MAX_TEMP) {
            System.out.println("Temperature cannot be greater than " + MAX_TEMP + " degrees Fahrenheit.");
            System.out.print("Enter temperature in Fahrenheit: ");
            temperatureF = input.nextInt();
        }
        // Convert temperature to Celsius
        double celsius = (temperatureF - 32) * 5 / 9;
        // Print the result
        System.out.printf("Temperature in Celsius: %.2f\n", celsius);
       
}
}