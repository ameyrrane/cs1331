import java.util.Scanner;

public class Selection {
    
    public static void main(String[] args) {
        
        System.out.print("How many items need to be sorted: ");
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();

        int[] array = new int[number];

        System.out.println("Enter all numbers!");

        for (int i : array) {

            i = input.nextInt();
            
        }

        for (int i : array) {
            
            System.out.println(i);
        }




    }
}
