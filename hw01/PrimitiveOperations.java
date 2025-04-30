public class PrimitiveOperations {
    
    public static void main(String[] args) {
        
        int var1 = 10;
        float var2 = 10.0F;

        System.out.println(var1);
        System.out.println(var2);

        float product = var1 * var2;

        System.out.println(product);

        float convertedVar1 = (float) var1;

        System.out.println(convertedVar1);

        char var3 = 'D';

        System.out.println(var3);

        char lowerVar3 = (char)((float) var3 + 32);

        System.out.println(lowerVar3);

    }
}
