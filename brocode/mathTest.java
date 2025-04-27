import java.util.Scanner;

public class mathTest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first side of the triangle: ");
        double side1 = input.nextDouble();
        System.out.print("Enter your Second side of the traingle: ");
        double side2 = input.nextDouble();

        double hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
        System.out.println("Hypotenuse of the triangle is " + hypotenuse);

    }
}