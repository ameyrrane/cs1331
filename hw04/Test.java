public class Test {
    
    public static void main(String[] args) {
        
        Fly fly1 = new Fly();

        System.out.println(fly1);

        // fly1.grow(-5);
        fly1.setMass(0);
        System.out.println(fly1.isDead());
        System.out.println(fly1);

        // Frog frog1 = new Frog("David");
        // System.out.println(frog1);

        // frog1.grow(20);
        // System.out.println(frog1);

        // Frog frog2 = new Frog("Yulia", 1.8, 7.0);
        // System.out.println(frog2);

        // System.out.println(Frog.getSpecies());

        // Frog.setSpecies("Frog");

        // System.out.println(Frog.getSpecies());


    }
}
