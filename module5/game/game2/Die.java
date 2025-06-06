import java.util.Random;

public class Die {
    
    public static final int TOTAL_SIDES = 6;
    private int faceValue;
    private Random rand;

    public Die() {
        rand = new Random();
        faceValue = 1;
    }

    public int roll() {
        faceValue = rand.nextInt(TOTAL_SIDES) + 1;
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public String toString() {
        return "Die with facevalue: " + faceValue;
    }

}
