import java.util.Scanner;

public class upperCase {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = input.nextLine();

        String upperCaseName = name.toUpperCase();

        System.out.println("Your name in uppercase is " + upperCaseName);
    }
}
