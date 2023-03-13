class parent {
    public void show() {
        System.out.println("inside parent class");
    }
}
class child1 extends parent {
    public void show() {
        System.out.println("inside child1");
    }
}
class child2 extends parent {
    public void show() {
        System.out.println("inside child2");
    }
}
public class Main {
    public static void main(String[] args) {
        parent p;

        //upcasting
        p = new child1();
        p.show();

        p = new child2();
        p.show();
    }
}