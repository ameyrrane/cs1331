import java.util.Random;

public class randomExample {

    public static void main(String[] args) {

        Random input = new Random();

        int x = input.nextInt(30) + 1;

        System.out.println(x);
    }
}