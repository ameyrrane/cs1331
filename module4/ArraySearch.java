public class ArraySearch {
    
    public static void main(String[] args) {
        
        String[] concepts = {"abstraction", "polymorphism", "inheritance", "encapsulation",};

        System.out.println(searchStringArray("abstraction", concepts));

    }

    public static String searchStringArray(String term, String[] searchItems) {

        String result = "not found!";

        for (String item : searchItems) {

            if (item != null && item.equalsIgnoreCase(term)) {
                result = "found!";
                break;
            }
        }

        return result;

    }
}
