public class Main {
    //class name and constructor name should and must be the same

    String s;

    //parameterized constructor

    Main(String s1) {
        s = s1;
    }

    public void show() {
        System.out.println(s);
    }

    public static void main(String[] args) {
        //parameter ka value diye parenthesis me
        Main obj = new Main("ABHISEK KUMAR");
        obj.show();
    }
}