import java.util.Scanner;

public class warmCheck {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What's the temperature outside? ");
        int temperature = input.nextInt();

        if (temperature < 20) {
            System.out.println("It's cold outside!");
        }
        else if (temperature >= 20 && temperature <= 30) {
            System.out.println("It's good weather outside!");
        }
        else {
            System.out.println("It's hot outside!");
        }


    }
}