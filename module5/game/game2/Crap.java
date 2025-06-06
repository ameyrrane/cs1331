public class Crap {
    
    private Die die1, die2;
    private int point;

    public Crap() {
        die1 = new Die();
        die2 = new Die();

    }

    public int doubleRoll() {
        int total = die1.roll() + die2.roll();
        System.out.println("Die one: " + die1.getFaceValue());
        System.out.println("Die two: " + die2.getFaceValue());

        return total;

    }

    public void go() {
        point = doubleRoll();

        System.out.println("Point: " + point);

        if ((point == 7) || (point == 11)) {
            System.out.println("Winner!");
        }
        else if ((point == 2) || (point == 3) || (point == 12)) {
            System.out.println("You Lost!");
        }
        else {
            System.out.println("Entering stage 2!");
            stage2();
        }
    }

    public void stage2() {

        boolean endGame = false;

        while (!endGame) {
        int total = doubleRoll();
        System.out.println("Total: " + total);
            if (total == point) {
                System.out.println("Winner!");
                endGame = true;
            }
            else if (total == 7) {
                System.out.println("You Lost!");
                endGame = true;
            }
        } 
    }

    public static void main(String[] args) {
        
        Crap crap1 = new Crap();

        crap1.go();
    }

}
