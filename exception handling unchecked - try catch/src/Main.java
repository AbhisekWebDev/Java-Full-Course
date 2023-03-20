public class Main {
    public static void main(String[] args) {

        //try block for possible exceptions
        try {
            System.out.println(5/0);
        }

        //catch block for catching exception object
        catch (ArithmeticException e) {
            System.out.println("number can not divided by zero");
        }
        System.out.println("prog executed successfully");
    }
}