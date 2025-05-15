public class Frog {
        //instance variables
        private String name;
        private int age;
        private double tongueSpeed;
        private boolean isFroglet;
        private static String SPECIES = "Rare Pepe"; 

        private static final int DEF_AGE = 5;
        private static final int DEF_TONGUE_SPEED = 5;
    
        //constructors
        public Frog(String name, double ageInYear, double tongueSpeed) {
    
            this(name, (int) (ageInYear * 12), tongueSpeed);
            
        }
        
        public Frog(String name, int age, double tongueSpeed) {
    
            this.name = name;
            this.age = age;
            this.tongueSpeed = tongueSpeed;
            this.isFroglet = (this.age <= 12);
            
        }

    
        public Frog(String name) {

            this(name, DEF_AGE, DEF_TONGUE_SPEED);
    
        }

        //methods
    
        //setters and getters
    
        public static String getSpecies() {
            return SPECIES;
        }
        
        public static void setSpecies(String newSpecies) {
            SPECIES = newSpecies;
        }

        public String toString() {

            if (isFroglet) 
                return String.format("My name is %s and I'm a rare froglet! I'm %d months old and my tongue has a speed of %.2f", this.name, this.age, this.tongueSpeed);
            
            else 
                return String.format("My name is %s and I'm a rare frog. I'm %d months old and my tongue has a speed of %.2f.", this.name, this.age, this.tongueSpeed);
            
        }
    
    
        public void grow(int addMonths) {
    
            this.tongueSpeed = calculateTongueSpeed(this.age, addMonths, this.tongueSpeed);
            this.age += addMonths;
            isFroglet = (this.age <= 12);
        }


        private static double calculateTongueSpeed(int age, int addMonths, double speed) {

            int newAge = age + addMonths;
            
            if (newAge <= 12) 
                return speed + addMonths;

            else if ((newAge > 12) && (newAge < 30) && (age < 12))
                return speed + (12 - age);
            
            else if (newAge >= 30)
                speed -=  (newAge - 30) * 0.5;
                
                return (speed > 5) ? speed: 5;
        }


        public void eat(Fly eatFly) {

            if (!eatFly.isDead()){
                
                if (this.tongueSpeed > eatFly.getSpeed()) {
                    eatFly.setMass(0);
                    if (eatFly.getMass() > 0.5 * this.age)
                        grow(1);
                }
                else
                    eatFly.setSpeed(eatFly.getSpeed() + 1);
                
            }
        }
    
    
}
