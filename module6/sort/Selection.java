import java.util.Random;
import java.util.Scanner;

public class Selection {
    
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

        // System.out.println("Unsorted numbers are as follows:");

        // for (int number : numbers) {
            
        //     System.out.print(number + " ");
        // }
        // System.out.println();

        long start = System.nanoTime();

        int temp;

        int counter = 0;

        while (counter < arrayLength) {

            for (int i = counter + 1; i < arrayLength; i++) {
                
                if (numbers[i] < numbers[counter]) {
                    
                    // temp = numbers[counter];
                    // numbers[counter] = numbers[i];
                    // numbers[i] = temp;
                    swap(numbers, i, counter);
                }

            }
            counter++;
        }

        long end = System.nanoTime();

        System.out.println("Elapsed time: " + (end - start));

        // System.out.println("Sorted numbers are as follows:");

        // for (int number : numbers) {
            
        //     System.out.print(number + " ");
        // }
        // System.out.println();
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
