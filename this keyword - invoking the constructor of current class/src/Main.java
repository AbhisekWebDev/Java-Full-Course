public class Main {
    int a, b;

    //default constructor
    Main() {
        this(10, 20);
        System.out.println("inside default constructor");
    }

    //parameterized constructor
    Main(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("inside parameterized constructor");
    }
    void show() {
        System.out.println("a = " + a + " " + "b = " + b);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.show();
    }
}