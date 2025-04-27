import java.util.Scanner;

public class switchDay {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the day? ");

        String day = input.next();

        switch (day) {
            case "Friday":
                System.out.println("It's the end of the week!");
                break;

            case "Saturday":
                System.out.println("It's the weekend!");
                break;

            case "Sunday":
                System.out.println("Man tomorrow is Monday!");
                break;
        
            default:
                System.out.println("Well we have to reach to the end of the week!");
                break;
        }

        
    }
}