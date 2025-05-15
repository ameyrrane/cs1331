public class Pond {
    
    

    public static void main(String[] args) {

        Frog peepo = new Frog("Peepo");
        Frog pepe = new Frog("Pepe", 10, 15);
        Frog peepaw = new Frog("Peepaw", 4.6, 5);
        Frog pepsi = new Frog("Pepsi");

        Fly fly1 = new Fly(1, 3);
        Fly fly2 = new Fly(6);
        Fly fly3 = new Fly();

        System.out.println(peepo);
        Frog.setSpecies("1331 Frogs");

        peepo.eat(fly2);
        System.out.println(fly2);

        peepo.grow(8);
        peepo.eat(fly2);

        System.out.println();
        System.out.println(fly2);
        System.out.println(peepo);

        System.out.println();
        System.out.println(pepsi);

        peepaw.grow(4);
        System.out.println(pepe);


        
    }
    

}
