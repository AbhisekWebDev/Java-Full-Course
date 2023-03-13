class parent {
    public static void show() {
        System.out.println("inside parent class");
    }
}
class child extends parent {
    public static void show() {
        System.out.println("inside child class/sub class");
    }
}
public class Main {
    public static void main(String[] args) {
        parent p = new parent();
        p.show();

        parent c = new child();
        c.show();
    }
}