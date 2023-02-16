public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        float f = 5.2f;
        System.out.printf("formatted with precision = %.2f\n", Math.PI); //this will print upto 2 decimal places
        System.out.printf("formatted to specific width f = %.4f\n", f); //this one automatically appends zeros to the rightmost part of decimal
    }
}