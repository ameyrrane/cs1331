import java.util.Scanner;

public class logiOperator {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Is it the weekend? ");
        String userInput = input.nextLine();

        if (userInput.equals("n") || userInput.equals("N")) {
            System.out.println("We have to wait for the weekend!");
        }
        else if (userInput.equals("y") || userInput.equals("Y")) {
            System.out.println("Let's party!");
        }
        else {
            System.out.println("Invalid input!");
        }


    }
}