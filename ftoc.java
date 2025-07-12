import java.util.InputMismatchException;
import java.util.Scanner;

public class ftoc {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the temperature outside in fahrenheit? ");
        boolean success = false;
        int temperatureF = 0;
        while (!success) {
            try {
                temperatureF = scanner.nextInt();
                success = true;
            } catch (InputMismatchException ie) {
                // TODO: handle exception
                System.out.println("Sorry that was not an integer!");
            }
        }

        double temperatureC = convertCToF(temperatureF);
        System.out.println(temperatureC);
    }

    public static double convertCToF(int temperatureF) {
        return (temperatureF - 32) * 5.0/9;
    }
}
