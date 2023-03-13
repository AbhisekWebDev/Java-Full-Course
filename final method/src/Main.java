    class Final {

    //final method
    final void show() {
        System.out.println("Inside Final Method");
    }
}
    public class Main {
    public static void main(String[] args) {
        Final obj = new Final();
        obj.show();
    }
}