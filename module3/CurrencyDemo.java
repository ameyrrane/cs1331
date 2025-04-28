import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Total number of items: ");
        int items = input.nextInt();

        System.out.print("Cost per item: ");
        double costPerItem = input.nextDouble();

        double total = items * costPerItem;

        NumberFormat curencyFormat = NumberFormat.getCurrencyInstance(Locale.US);

        
        System.out.println("Unformatted total: " + total);        
        System.out.println("Formatted total: " + curencyFormat.format(total));
        
    }
    
}
