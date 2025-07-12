public abstract class Pet {
    private String name;
    private double health;
    private int painLevel;
    
    public Pet(String name, double health, int painLevel) {
        this.name = name;
        if (health <= 0.0 ) {
            this.health = 0.0;
        } else if (health >= 1.0) {
            this.health = 1.0;
        } else {
            this.health = health;
        }
        if (painLevel <= 1 ) {
            this.painLevel = 1;
        } else if (painLevel >= 10) {
            this.painLevel = 10;
        } else {
            this.painLevel = painLevel;
        }
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public int getPainLevel() {
        return painLevel;
    }

    public abstract int treat();

    public void speak() {
        String words = String.format("Hello! My name is %s", this.name);
        if (this.painLevel > 5) {
            System.out.println(words.toUpperCase());
        } else {
            System.out.println(words);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Pet))
            return false;
        Pet other = (Pet) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    protected void heal() {
        this.health = 1.0;
        this.painLevel = 1;
    }

    

    
}