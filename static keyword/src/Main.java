public class Main {
    //static variable
    static int a = fun();

    //static block
    static {
        System.out.println("inside static block");
    }

    //static method
    static int fun() {
        System.out.println("inside fun()");
        return 10;
    }
    public static void main(String[] args) {
        System.out.println(a);
    }
}