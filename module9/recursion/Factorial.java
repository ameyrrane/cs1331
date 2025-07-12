import java.util.Scanner;

public class Factorial {
    public static int findFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * findFactorial(num-1);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is number you want factorial for? ");
        int number = input.nextInt();
        System.out.println(findFactorial(number));
    }
}
