class instanceVariable {
    int x;
}
public class Main {
    public static void main(String[] args) {
        //creating object of instance variable
        instanceVariable obj = new instanceVariable();
        //assigning value
        obj.x = 20;
        System.out.println(obj.x);
    }
}