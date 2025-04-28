import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("What is the temperature of the day in Fahrenheit? ");

        int temperatureF = input.nextInt();

        double temperatureC = (5.0/9) * (temperatureF - 32);

        // System.out.println("Temperature in Celcius is " + temperatureC);

        System.out.printf("Temperature in Celcius is %.1f\n" , temperatureC);



    }
}
