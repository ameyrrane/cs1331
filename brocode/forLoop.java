import java.util.Scanner;

public class forLoop {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is the pyramid size? ");

        int number = input.nextInt();

        for(int i = 1; i <= number; i++){

            for (int j = 0; j < i; j++) {
                
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
