final class FinalClass {
    void show() {
        System.out.println("inside final class");
    }
}


public class Main {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();
    }
}