package module9;

public class BinCompare<T extends Comparable<T>> {
    private T compare1;
    private T compare2;

    public BinCompare(T compare1, T compare2) {
        this.compare1 = compare1;
        this.compare2 = compare2;
    }

    public int compare() {
        return compare1.compareTo(compare2);
    }

    public static void main(String[] args) {
        BinCompare<String> compare2Strings = new BinCompare<>("something something"
                                                        , "everything everything");
        System.out.println(compare2Strings.compare());

    }
}
