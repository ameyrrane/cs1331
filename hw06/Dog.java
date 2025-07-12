public class Dog extends Pet {
    private double droolRate;

    public Dog(String name, double health, int painLevel, double droolRate) {
        super(name, health, painLevel);
        if (droolRate <= 0) {
            this.droolRate = 0.5;
        } else{
            this.droolRate = droolRate;
        }
        
    }

    public double getDroolRate() {
        return droolRate;
    }

    public int treat() {
        int time;
        if (droolRate < 3.5) {
            time = (int) Math.ceil((this.getPainLevel() * 2) / this.getHealth());
        } else if (droolRate <= 7.5) {
            time = (int) Math.ceil(this.getPainLevel()/this.getHealth());
        } else {
            time = (int) Math.ceil(this.getPainLevel()/(this.getHealth() * 2));
        }
        super.heal();
        return time;
    }

    public void speak() {
        super.speak();
        String barking = "";
        for (int i = 0; i < this.getPainLevel(); i++) {
            barking += "bark ";
        }
        if (this.getPainLevel() > 5) {
            barking = barking.toUpperCase();
        }

        System.out.println(barking.trim());
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (!(obj instanceof Dog))
            return false;
        Dog other = (Dog) obj;
        if (Double.doubleToLongBits(droolRate) != Double.doubleToLongBits(other.droolRate))
            return false;
        return true;
    }

    

    
}
