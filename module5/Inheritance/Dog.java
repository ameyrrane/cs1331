public class Dog extends Canine {
    
    protected String name;
    private double size;

    public Dog(String name, double size) {
        super(size);
        this.name = name;

    }

    public void fetch() {
        System.out.println("Run");
        System.out.println("Clinch");
        System.out.println("Return");
    }

    public void groom(){}
}
