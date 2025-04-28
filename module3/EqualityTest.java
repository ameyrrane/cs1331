public class EqualityTest {
    
    public static void main(String[] args) {
        
        String input1 = "Park";

        String input2 = "park";

        if (input1 == input2) {
            System.out.println("Same alias!");
        }

        if (input1.equalsIgnoreCase(input2)) {
            System.out.println("Same content while ignoring the case!");
        }
    }
}
