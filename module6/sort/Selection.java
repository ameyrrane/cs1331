import java.util.Scanner;

public class Selection {
    
    public static void main(String[] args) {
        
        System.out.print("How many items need to be sorted: ");
        Scanner input = new Scanner(System.in);
        
        int arrayLength = input.nextInt();

        int[] numbers = new int[arrayLength];

        System.out.println("Enter all numbers!");

        for (int i = 0; i < arrayLength; i++) {

            numbers[i] = input.nextInt();
            
        }

        int temp;

        int start = 0;

        while (start < arrayLength) {

            for (int i = start + 1; i < arrayLength; i++) {
                
                if (numbers[i] < numbers[start]) {
                    
                    temp = numbers[start];
                    numbers[start] = numbers[i];
                    numbers[i] = temp;
                }

            }
            start++;
        }

        for (int number : numbers) {
            
            System.out.println(number);
        }
    }
}
