public class Main {
    //default constructor
    Main() {
        //invoke parameterized constructor
        this("abhisek");
        System.out.println("default constructor called");
    }

    //parameterized constructor
    Main(String str) {
        System.out.println("parameterized constructor called");
    }
    public static void main(String[] args) {
        Main obj = new Main();
    }
}