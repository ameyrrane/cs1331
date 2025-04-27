import java.util.Scanner;

public class doWhile {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name ;

        do{

            System.out.print("Enter your name: ");
            name = input.nextLine();
        } while (name.isBlank());

        System.out.println("Hello " + name);


    }
}
