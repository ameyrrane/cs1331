import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        
        // Give user list of options for operations to choose from.
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        System.out.println("Enter an operation:");

        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine().toLowerCase();
        String errorMessage = "Invalid input entered. Terminating...";

        
        switch (operation) {
            case "add":
                System.out.println("Enter two integers:");
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
                System.out.println("Enter two integers:");
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
                System.out.println("Enter two doubles:");
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
                System.out.println("Enter two doubles:");
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
                System.out.println("Enter two words:");
                
                String input1 = scanner.next();
                String input2 = scanner.next();

                if (input1.toLowerCase().compareTo(input2.toLowerCase()) == 0 ) {
                    System.out.println("Answer: Chicken or Egg");
                } else if (input1.toLowerCase().compareTo(input2.toLowerCase()) < 0) {
                    System.out.println("Answer: " + input1 + " comes before " + input2 + " alphabetically.");
                    
                } else {
                    System.out.println("Answer: " + input2 + " comes before " + input1 + " alphabetically.");
                }
                break;
            default:
                System.out.println(errorMessage);
        }
    }
}
