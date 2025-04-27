import java.util.Scanner;

public class FToC {
    
    public static double convertToC ( int F) {
        return (5D/9) * (F - 32);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value: ");
        int fahreneheit = input.nextInt();
        System.out.print("Enter day of the week: ");
        String day = input.next();

        System.out.println(day + " Faherneheit: " +convertToC(fahreneheit));
        System.out.println(day + " Celsius: " + convertToC(fahreneheit));
    }
    
}