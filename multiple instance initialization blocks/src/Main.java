public class Main {

    //instance initialization block 1
    {
        System.out.println("instance initialization block 1");
    }
    //instance initialization block 2
    {
        System.out.println("instance initialization block 2");
    }

    //default constructor
    Main() {
        System.out.println("default constructor called");
    }
    //instance initialization block 2
    {
        System.out.println("instance initialization block 3");
    }
    public static void main(String[] args) {
        Main obj = new Main();
    }
}