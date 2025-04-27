import java.util.ArrayList;
import java.util.Scanner;

public class studentGrades {

    public static void main(String[] args) {

        
        
        ArrayList <Integer> scores = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        System.out.print("How many subjects? ");
        int count = input.nextInt();

        System.out.println("Enter your score:");

        for (int i = 0; i < count; i++) {
            
            System.out.print("Subject " + (i+1) + " ");
            scores.add(input.nextInt());
        }

        double sum = 0.0;

        for (int score : scores) {
            
            sum += score;

        }

        double average = sum / scores.size();

        System.out.println("Average is " + average);


    }
    
}
