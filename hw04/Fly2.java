public class Fly {
    private double mass; //in grams
    private double speed;
    
    public Fly(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }
    
    public Fly(double mass) {
        this(mass, 10.0);
    }
    
    public Fly() {
        this(5.0,10.0);
    }
    
    public double getMass() {
        return this.mass;
    }
    
    public void setMass(double mass) {
        this.mass = mass;
    }
    
    public double getSpeed() {
        return this.speed;
    }
    
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    public String toString() {
        if (this.isDead()) {
            return String.format("I'm dead, but I used to be a fly with a speed of %.2f", this.speed);
        }
        return String.format("I'm a speedy fly with %.2f speed and %.2f mass", this.speed, this.mass);
    }
    
    public boolean isDead() {
        return this.mass == 0;
    }
        
}