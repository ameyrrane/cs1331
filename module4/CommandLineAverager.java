
public class CommandLineAverager {
    
    public static void main(String[] args) {
        
        double sum = 0;

        for ( String number : args) {

            sum += Double.parseDouble(number);
            
        }

        double average = (args.length != 0) ? sum / args.length : 0;

        System.out.printf("Average is %.2f\n", average);
    }
}
