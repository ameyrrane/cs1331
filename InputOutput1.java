import java.util.Scanner;

public class InputOutput1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Faherenheit value: ");

        int temperatureF = input.nextInt();
        input.nextLine();

        System.out.print("What is the day of the week? ");

        String day = input.next();

        double temperatureC = (5.0/9) * (temperatureF - 32);

        System.out.printf("%s temperature in Faherenheit is %d\n", day, temperatureF );

        System.out.printf("%s temperature in Celcius is %.1f\n", day, temperatureC );

    }
}
