public class InsectClient {
    
    public static void main(String[] args) {

        Insect bug1 = new Insect(10, 100,90);

        System.out.println(bug1.getWeight());

        bug1.move(1, 10);

        System.out.printf("New Weight: %.2f\n", bug1.getWeight());
        
        System.out.println(Insect.produceRandomFacts());
    }
}
