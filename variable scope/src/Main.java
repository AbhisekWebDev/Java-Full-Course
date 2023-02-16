class variableScope {
    //variable defined inside a class
    int x;
}
public class Main {
    public static void main(String[] args) {
        //creatine a variableScope class object
        variableScope obj = new variableScope();

        obj.x = 10;
        
        System.out.println(obj.x);
    }
}