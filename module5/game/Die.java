import java.util.Random;

public class Die {
    
    public static final int SIZE = 6;
    private int faceValue;
    private Random rand;

    public Die() {

        faceValue = 1;
        rand = new Random();
    }

    public int roll() {
        faceValue = rand.nextInt(SIZE) + 1;
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public String toString() {
        return "Die with facevalue: " + faceValue;
    }
    public static void main(String[] args) {

        Die die1 = new Die();

        System.out.println(die1);
        System.out.println(die1.roll());
        System.out.println(die1.roll());
    }
}
