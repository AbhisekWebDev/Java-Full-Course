interface Interface1 {
    // Default method
    default void show() {
        System.out.println("Default Interface 1");
    }
}
interface Interface2 {
    // Default method
    default void show() {
        System.out.println("Default Interface 2");
    }
}
public class Main implements Interface1, Interface2 {
    // Overriding default method
    public void show() {
        // Using super keyword to call the show() method of 'Interface1'
        Interface1.super.show();
        // Using super keyword to call the show() method of 'Interface2'
        Interface2.super.show();
    }

    public static void main(String args[]) {
        Main obj = new Main();
        obj.show();
    }
}