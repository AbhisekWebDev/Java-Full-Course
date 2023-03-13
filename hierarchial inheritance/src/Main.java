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
class cat extends animal {
    public void meow() {
        System.out.println("meowing");
    }
}
public class Main {
    public static void main(String[] args) {
        cat obj = new cat();
        dog obj1 = new dog();
        obj.eat();
        obj.meow();
        obj1.bark();
        

    }
}