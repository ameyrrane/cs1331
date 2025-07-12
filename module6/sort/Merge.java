import java.util.Random;
import java.util.Scanner;

public class Merge {
    
    public static void main(String[] args) {
        
        System.out.print("How many items need to be sorted: ");
        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        
        int arrayLength = input.nextInt();

        int[] numbers = new int[arrayLength];

        System.out.println("Enter all numbers!");

        for (int i = 0; i < arrayLength; i++) {

            numbers[i] = rand.nextInt(100);
            
        }

        System.out.println("Unsorted numbers are as follows:");

        for (int number : numbers) {
            
            System.out.print(number + " ");
        }
        System.out.println();

        int temp;

        int counter = 0;

        while (counter < arrayLength) {

            for (int i = counter + 1; i < arrayLength; i++) {
                
                if (numbers[i] < numbers[counter]) {
                    
                    temp = numbers[counter];
                    numbers[counter] = numbers[i];
                    numbers[i] = temp;
                }

            }
            counter++;
        }

        System.out.println("Sorted numbers are as follows:");

        for (int number : numbers) {
            
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
