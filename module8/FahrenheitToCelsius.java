import java.util.InputMismatchException;
import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        boolean success = false;
        
        while(!success) {
            System.out.print("What is the temperature in f: ");
            // try {
            //     int temperatureF = input.nextInt();
            //     double temperatureC = 5.0 / 9 * (temperatureF - 32);
            //     System.out.println("temerpature in celsius is " + temperatureC);
            //     success = true;
            // } catch (InputMismatchException ime) {
            //     input.next();
            //     System.out.println("Input is not an integer");
            // }
            if (input.hasNextInt()) {
                int temperatureF = input.nextInt();
                double temperatureC = 5.0 / 9 * (temperatureF - 32);
                System.out.println("temerpature in celsius is " + temperatureC);
                success = true;
            }
            else{
                input.next();
                System.out.println("Input is not an integer");
            }
        }
    }

     
}