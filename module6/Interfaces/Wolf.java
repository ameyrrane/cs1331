import java.util.Arrays;

public class Wolf extends Canine implements Groomable, Comparable<Wolf> {
    
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

    public int compareTo(Wolf anotherWolf) {
        return -(rank - anotherWolf.rank);
    }

    public String toString() {
        return ("Size " + size);
    }

    public static void main(String[] args) {
        Wolf[] pack = {
            new Wolf(2, 17.1),
            new Wolf(10, 3),
            new Wolf(7, 9.2),
            new Wolf(8, 9.1),
            new Wolf(3, 17.01),
            new Wolf(1, 16.2),
        };

        System.out.println("Unsorted Pack: " + Arrays.toString(pack));
        Arrays.sort(pack);
        System.out.println();
        System.out.println("Sorted Pack: " + Arrays.toString(pack));

    }

}
