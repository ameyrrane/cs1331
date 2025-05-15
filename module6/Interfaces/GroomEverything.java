public class GroomEverything {
    
    public static void main(String[] args) {
        
        Groomable[] groomer = {
            new Wolf(3, 17.1),
            new Poodle("richie", 9, "Lux Brand", "Rich Brand"),
            new Wolf(5, 16),
            new Poodle("pixy", 4, "Top shelf", "Only the Best"),
            new Car("Yuhina", "Spark", 2037)
        };
        
        for (Groomable c: groomer) {
            c.groom();
        }
    }
}
