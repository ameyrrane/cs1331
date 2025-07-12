public class Cat extends Pet {
    private int miceCaught;

    public Cat(String name, double health, int painLevel, int miceCaught) {
        super(name, health, painLevel);
        if (miceCaught < 0) {
            miceCaught = 0;
        }
        this.miceCaught = miceCaught;
    }

    public Cat(String name, double health, int painLevel) {
        this(name, health, painLevel, 0);
    }

    public int getMiceCaught() {
        return miceCaught;
    }

    public int treat() {
        int time;
        if (miceCaught < 4) {
            time = (int) Math.ceil((this.getPainLevel() * 2) / this.getHealth());
        } else if (miceCaught <= 7) {
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
        for (int i = 0; i < this.miceCaught; i++) {
            barking += "meow ";
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
        if (!(obj instanceof Cat))
            return false;
        Cat other = (Cat) obj;
        if (miceCaught != other.miceCaught)
            return false;
        return true;
    }

    
}
