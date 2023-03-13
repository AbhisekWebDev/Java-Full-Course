class instanceInitializationBlock {

    instanceInitializationBlock() {
        System.out.println("parent class default constructor");
    }

    //parent class instance initialization block
    {
        System.out.println("parent class instance initialization block");
    }
}
public class Main extends instanceInitializationBlock {
    Main() {
        super();
        System.out.println("child class default constructor");
    }

    //child class instance initialization block
    {
        System.out.println("child class instance initialization block");
    }
    public static void main(String[] args) {
        instanceInitializationBlock obj = new instanceInitializationBlock();
    }
}