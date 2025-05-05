public class Test {
    
    public static void main(String[] args) {
        
        Fly fly1 = new Fly();

        System.out.println(fly1);

        fly1.grow(-5);
        System.out.println(fly1.isDead());
        System.out.println(fly1);
    }
}
