public class Wolf extends Canine {
    
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

}
