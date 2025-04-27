import java.util.Scanner;

public class factultyList {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many faculty members: ");

        int number = input.nextInt();
        
        String[] faculty = new String[number];

        for (int i = 0; i < faculty.length; i++) {
            
            System.out.print((i+1) + ": ");
            faculty[i] = input.next();
        }
        
        for (int i = 0; i < faculty.length; i++) {
            
            System.out.println(faculty[i] + " is " + (i + 1) + "st member.");
        }

    }
}
