import java.util.Scanner;

public class F2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the number you would like to conver? ");

        int number = input.nextInt();

        double convertTemperature = 5.0/9 * (number - 32);

        // System.out.println("Temparature in Celsius is " + convertTemperature);
        System.out.printf("Temperature in celsius is %-20.2f F\n", convertTemperature);
    }
}
