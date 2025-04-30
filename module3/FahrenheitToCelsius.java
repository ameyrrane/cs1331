

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fahrenheit value: ");

        int temperatureF = input.nextInt();

        if (temperatureF > 80) {
            System.out.println("It's too hot to go outside!");
        }
        else if (temperatureF < 80 && temperatureF >= 70) {
            
            String isRaining;
            do {
                System.out.print("Is it raining? y or n: ");
                isRaining = input.next();
            } while(!isRaining.contentEquals("y") && !isRaining.equalsIgnoreCase("n") );

            System.out.println((isRaining.equalsIgnoreCase("n")) ? "Yay, let's go to the park!" : "Stay at home! It's raining!");
            
        }

        else {
            System.out.println("It's too cold outside!");
        }
    }
}
