public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(36/0);
        } catch (NullPointerException e) {
            System.out.println("exception not handled by catch");
        } finally {
            System.out.println("finally block is always executed");
        }
    }
}