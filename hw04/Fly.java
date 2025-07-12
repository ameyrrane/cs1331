public class Fly {
    
    //instance variables
    private double mass;
    private double speed;
    private static final double DEFAULT_FLY_SPEED = 10.0;
    private static final double DEFAULT_FLY_MASS = 5.0;

    //constructors
    public Fly(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }

    public Fly(double mass) {
        this(mass, DEFAULT_FLY_SPEED);
    }

    public Fly() {
        this(DEFAULT_FLY_MASS, DEFAULT_FLY_SPEED);
    }

    //methods
    public double getMass () {
        return this.mass;
    }
    
    public void setMass (double mass) {
        this.mass = mass;
    }

    public double getSpeed () {
        return this.speed;
    }
    
    public void setSpeed (double speed) {
        this.speed = speed;
    }


    public String toString() {

        if (isDead()) 
            return String.format("I'm dead, but I used to be a fly with a speed of %.2f.", this.speed);
        
        else 
            return String.format("I'm a speedy fly with %.2f speed and %.2f mass.", this.speed, this.mass);
        
    }

    public void grow(int addedMass) {
        for (int index = 0; index < addedMass; index++) {
            this.mass++;
            if (this.mass <= 20) {
                this.speed++;
            } else {
                this.speed -= 0.5;
            }
        }
    }

    public boolean isDead() {

        return (this.mass == 0);
    }

}
