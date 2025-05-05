public class Frog {
        //instance variables
        private String name;
        private int age;
        private double tongueSpeed;
        boolean isFroglet;
        private static String SPECIES = "Rare Pepe"; 

        private final int DEF_AGE = 5;
        private final int DEF_TONGUE_SPEED = 5;
    
        //constructors
        public Frog(String name, int age, double tongueSpeed) {
    
            this.name = name;
            this.age = age;
            this.tongueSpeed = tongueSpeed;
        }
    
        public Frog(String name, double ageInYear, double tongueSpeed) {
    
            this.name = name;
            this.age = (int) ageInYear * 12;
            this.tongueSpeed = tongueSpeed;
        }
    
        public Frog(String name) {
    
            this.name = name;
            this.age = DEF_AGE;
            this.tongueSpeed = DEF_TONGUE_SPEED;
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
    
            if (this.name == 0) {
                return String.format("I'm dead, but I used to be a fly with a speed of %.2f\n", this.speed);
            }
            else {
                return String.format("I'm a speedy fly wiht %.2f speed and %.2f name\n", this.speed, this.name);
            }
        }
    
        public void grow(int addMonths) {
    
            
            
            
    
            this.name = newname;
        }

        private static void calculateTongueSpeed(int addMonths) {

            int newAge = this.age + addMonths;
            
            if (newAge <= 12) 
                this.tongueSpeed += addMonths;
            
            else if (newAge >= 30)
                this.tongueSpeed -= addname * 0.5;
            else 
                this.speed += (20 - this.name) - (newname - 20) * 0.5;
        }
    
    
}
