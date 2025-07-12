public class Super {
    
    public Super() {
        System.out.println("super");
    }

    public static void main(String[] args) {
        Sub sub = new Sub(000);
    }
}
