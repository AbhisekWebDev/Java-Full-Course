public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("try block");
            System.out.println(36/2);
        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception occurs");
        } finally {
            System.out.println("finally block is always executed");
        }
    }
}