public class Main {

    //instance initialization block
    {
        System.out.println("instance initialization block");
    }

    //default constructor
    Main() {
        System.out.println("default constructor called");
    }
    public static void main(String[] args) {
        Main obj = new Main();
    }
}