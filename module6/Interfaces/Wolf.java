public class Wolf extends Canine implements Groomable, Comparable {
    
    protected int rank;

    public Wolf(int rank, double size) {
        super(size);
        this.rank = rank;

    }

    public final int getRank() {
        return rank;
    }

    public void bark() {
        for (int i = 0; i < 3; i++) {
            super.bark();
        }
    }

    public void groom(){
        System.out.println("lick");
    }

    public 

}
