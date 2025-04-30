import java.util.Scanner;

public class BreakContinue {
    
    public static void main(String[] args) {
        
        final int MAX_TEMP = 140;
        final int MIN_TEMP = -100;
        
        Scanner input = new Scanner(System.in);

        int temperatureF;
        
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter temperature in Fahrenheit: ");
            temperatureF = input.nextInt();

            if (temperatureF < MAX_TEMP && temperatureF > MIN_TEMP) {
                 // Convert temperature to Celsius
                double celsius = (temperatureF - 32) * 5 / 9;
                // Print the result
                System.out.printf("Temperature in Celsius: %.2f\n", celsius);
                
                
            } 
            
            else {
                
                System.out.println("Invalid value!");
                break;
            }
        }
        System.out.println("Goodbye!");
        input.close();
    }
}   
