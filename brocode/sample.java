import java.util.Scanner;

public class sample{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your number? ");
        int number = input.nextInt();
        double halfNumber = (double) number / 2;
        System.out.println("Half of your number is " + halfNumber);
    }
}