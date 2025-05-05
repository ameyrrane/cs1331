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

        this.mass = mass;
        this.speed = DEFAULT_FLY_SPEED;
    }

    public Fly() {

        this.mass = DEFAULT_FLY_MASS;
        this.speed = DEFAULT_FLY_SPEED;
    }

    //methods

    //setters and getters

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

        if (isDead()) {
            return String.format("I'm dead, but I used to be a fly with a speed of %.2f\n", this.speed);
        }
        else {
            return String.format("I'm a speedy fly wiht %.2f speed and %.2f mass\n", this.speed, this.mass);
        }
    }

    public void grow(double addMass) {

        double newMass = this.mass + addMass;
        
        if (newMass <= 20) 
            this.speed += addMass;
        
        else if (this.mass >= 20)
            this.speed -= addMass * 0.5;
        else 
            this.speed += (20 - this.mass) - (newMass - 20) * 0.5;

        this.mass = newMass;
    }

    public boolean isDead() {

        return (this.mass == 0);
    }

}
