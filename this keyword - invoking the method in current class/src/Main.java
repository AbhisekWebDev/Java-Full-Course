public class Main {

    public void show() {
        //calling function print() using "this" keyword
        this.print();
        System.out.println("inside show() function");
    }
    public void print() {
        System.out.println("inside print() function");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.show();
    }
}