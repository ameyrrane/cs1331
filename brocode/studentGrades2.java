import java.util.Scanner;

public class studentGrades2 {

    public static void main(String[] args) {

        
        
        
        Scanner input = new Scanner(System.in);

        System.out.print("How many subjects? ");
        int count = input.nextInt();

        int[] scores = new int[count];

        System.out.println("Enter your score:");

        for (int i = 0; i < count; i++) {
            
            System.out.print("Subject " + (i+1) + " ");
            scores[i] = input.nextInt();
        }

        double sum = 0.0;

        for (int score : scores) {
            
            sum += score;

        }

        double average = sum / scores.length;

        System.out.println("Average is " + average);


    }
    
}
