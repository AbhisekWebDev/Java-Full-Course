public class Narrowingconversion {
    public static void main(String[] args) {
        double d = 25.123;
        int i = (int) d;
        byte b = (byte) i;
        System.out.println("double value " + d);
        System.out.println("int value " + i);
        System.out.println("byte value " + b);
    }
}
