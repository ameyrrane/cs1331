public class Insect2 {
    
    //instance variable
    private double weight;
    private int x;
    private int y;

    //constructor
    public Insect2(double weight, int x, int y) {
        this.weight = weight;
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        
        Insect2 buzz1 = new Insect2(4.0,0,0);
        System.out.println("x = " + buzz1.x);
        System.out.println("y = " + buzz1.y);
        System.out.println("weight = " + buzz1.weight);
    }

}
