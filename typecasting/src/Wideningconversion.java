public class Wideningconversion {
    public static void main(String[] args) {
        //automatic type conversion
        int i = 214783647;
        long l = i; //automatically converted to long
        l+=1;
        double d = l; //automatically converted to double
        System.out.println("int value " + i);
        System.out.println("long value " + l);
        System.out.println("double value " + d);
    }
}
