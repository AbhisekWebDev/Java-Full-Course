class animal {
    public void eat() {
        System.out.println("eating");
    }
}
class dog extends animal {
    public void bark() {
        System.out.println("barking");
    }
}
class puppy extends dog {
    public void run() {
        System.out.println("running");
    }
}
public class Main {
    public static void main(String[] args) {
        puppy obj = new puppy();
        obj.eat();
        obj.bark();
        obj.run();
    }
}