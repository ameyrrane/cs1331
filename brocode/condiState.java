import java.util.Scanner;

public class condiState {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter your second number: ");
        int secondNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("First number is bigger!");
        }
        else if (secondNumber > firstNumber) {
            System.out.println("Second number is bigger!");
        }
        else {
            System.out.println("Both numbers are the same!");
        }
        
    }
}