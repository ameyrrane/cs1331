import java.util.Scanner;

public class Averager {
    
    public static void main(String[] args) {
        
        System.out.println("How many numbers? ");

        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        double[] numbers = new double[size];

        double sum = 0;

        System.out.println("Enter numbers:");

        for ( double number : numbers) {

            number = input.nextDouble();
            sum += number;
            
        }

        double average = sum / numbers.length;

        System.out.printf("Average is %.2f\n", average);

    }
}
