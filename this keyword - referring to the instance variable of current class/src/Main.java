public class Main {
    int a, b;

    //parameterized constructor
    Main(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void show() {
        //displaying values of variables a & b
        System.out.println("a = " + a + " " + "b = " + b);
    }
    public static void main(String[] args) {
        Main obj = new Main(10, 20);
        obj.show();
    }
}