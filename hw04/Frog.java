public class Frog {
    // instance variables
    private String name;
    private int age; // number of months.
    private double tongueSpeed;
    private boolean isFroglet; // A Frog is a froglet if it is more than 1 month old but fewer than 7 months
                               // old.
    private static String SPECIES = "Rare Pepe";

    private static final int DEF_AGE = 5;
    private static final int DEF_TONGUE_SPEED = 5;

    // constructors
    public Frog(String name, int age, double tongueSpeed) {
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        this.isFroglet = (this.age > 1 && this.age < 7);
    }

    public Frog(String name, double ageInYears, double tongueSpeed) {
        this(name, (int) (ageInYears * 12), tongueSpeed);
    }

    public Frog(String name) {

        this(name, DEF_AGE, DEF_TONGUE_SPEED);

    }

    // methods
    public void grow(int addMonths) {
        for (int i = 0; i < addMonths; i++) {
            this.grow();
        }
    }

    public void grow() {
        this.age++;
        if (this.age <= 12) {
            this.tongueSpeed++;
        } else if (this.age > 30 && this.tongueSpeed > 5) {
            this.tongueSpeed--;
        }
        this.isFroglet = (this.age > 1 && this.age < 7);
    }

    public void eat(Fly eatFly) {

        if (!eatFly.isDead()) {

            if (this.tongueSpeed > eatFly.getSpeed()) {
                eatFly.setMass(0);
                if (eatFly.getMass() >= 0.5 * this.age)
                    this.grow();
            } else
                eatFly.setSpeed(eatFly.getSpeed() + 1);

        }
    }

    public String toString() {

        if (isFroglet){
            return String.format(
                    "My name is %s and I'm a rare froglet! I'm %d months old and my tongue has a speed of %.2f.",
                    this.name, this.age, this.tongueSpeed);
        }
        else {
            return String.format(
                    "My name is %s and I'm a rare frog. I'm %d months old and my tongue has a speed of %.2f.",
                    this.name, this.age, this.tongueSpeed);
        }

    }    
    //Setter and getter
    public static String getSpecies() {
        return SPECIES;
    }

    public static void setSpecies(String newSpecies) {
        SPECIES = newSpecies;
    }

}
