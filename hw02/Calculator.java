import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        
        // Give user list of options for operations to choose from.
        System.out.println("Choose form the following operations:");
        System.out.println("add subtract multiply divide alphabetize");

        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine().trim().toLowerCase();
        String errorMessage = "Invalid input entered. Terminating...";

        
        switch (operation) {
            case "add":
                System.out.print("Enter two integers: ");
                if (scanner.hasNextInt() == false) {
                    System.out.println(errorMessage);
                    break;
                }
                int num1 = scanner.nextInt();
                if (scanner.hasNextInt() == false) {
                    System.out.println(errorMessage);
                    break;
                }
                int num2 = scanner.nextInt();
                System.out.println("Answer: " + (num1 + num2));
                break;
            case "subtract":
                System.out.print("Enter two integers: ");
                if (scanner.hasNextInt() == false) {
                    System.out.println(errorMessage);
                    break;
                }
                num1 = scanner.nextInt();
                if (scanner.hasNextInt() == false) {
                    System.out.println(errorMessage);
                    break;
                }
                num2 = scanner.nextInt();
                
                System.out.println("Answer: " + (num1 - num2));
                break;

                
            case "multiply":
                System.out.print("Enter two doubles: ");
                if (scanner.hasNextDouble() == false) {
                    System.out.println(errorMessage);
                    break;
                }
                double num3 = scanner.nextDouble();
                if (scanner.hasNextDouble() == false) {
                    System.out.println(errorMessage);
                    break;
                }
                double num4 = scanner.nextDouble();
                
                System.out.printf("Answer: %.2f\n", (num3 * num4));
                break;
            case "divide":
                System.out.print("Enter two doubles: ");
                if (scanner.hasNextDouble() == false) {
                    System.out.println(errorMessage);
                    break;
                }
                num3 = scanner.nextDouble();
                if (scanner.hasNextDouble() == false) {
                    System.out.println(errorMessage);
                    break;
                }
                num4 = scanner.nextDouble();
                if (num4 == 0) {
                    System.out.println(errorMessage);
                    break;
                }
                
                System.out.printf("Answer: %.2f\n", (num3 / num4));
                break;
            case "alphabetize":
                System.out.print("Enter two words: ");
                
                String input1 = scanner.next().toLowerCase();
                String input2 = scanner.next().toLowerCase();

                if (input1.compareTo(input2) == 0 ) {
                    System.out.println("Chicken or Egg");
                }
                else {
                    if (input1.compareTo(input2) > 0) {
                        System.out.println(input1 + " comes before " + input2);
                    }
                    else {
                        System.out.println(input2 + " comes before " + input1);
                    }
                break;

                }
            default:
                System.out.println(errorMessage);
        }
    }
}
