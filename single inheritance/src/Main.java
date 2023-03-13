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
public class Main {
    public static void main(String[] args) {
        dog obj = new dog();
        obj.eat();
        obj.bark();
    }
}