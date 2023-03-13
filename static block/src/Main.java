public class Main {

    static int a= 10, b;

    static {
        System.out.println("Static Block Initialized");
        b = a*4;
    }
    public static void main(String[] args) {

        System.out.println(a);
        System.out.println(b);
    }
}