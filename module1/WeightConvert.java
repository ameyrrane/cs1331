import java.util.Scanner;

public class WeightConvert {
    
    public static double kgToLbs(int weight) {
        return weight * 2.2;
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight in kgs:");
        int weight = input.nextInt();
        double weightLbs = kgToLbs(weight);
        System.out.printf("Weight in pounds is %.2f\n" , weightLbs);
    }
}
