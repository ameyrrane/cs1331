public class PrimitiveOperations {
    
    public static void main(String[] args) {
        
        int var1 = 10;
        double var2 = 10.0;

        System.out.println(var1);
        System.out.println(var2);

        double product = var1 * var2;

        System.out.println(product);

        double convertedVar1 = (double) var1;

        System.out.println(convertedVar1);

        int convertedVar2 = (int) var2;

        System.out.println(convertedVar2);

        char var3 = 'D';

        System.out.println(var3);

        char lowerVar3 = (char)((double) var3 + 32);

        System.out.println(lowerVar3);

    }
}
