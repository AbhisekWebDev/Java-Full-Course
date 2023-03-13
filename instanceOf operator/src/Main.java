//creating parent class
class parent {

}

//creating an interface
interface myInterface {

}

//creating child class
class child extends parent implements myInterface{

}
public class Main {
    public static void main(String[] args) {

        //creating the objects of a parent and child class
        parent obj1 = new parent();
        child obj2 = new child();
        Main obj3 = null;

        System.out.println("obj1 is instance of parent class = " +(obj1 instanceof parent));
        System.out.println("obj1 is instance of child class = " +(obj1 instanceof child));
        System.out.println("obj1 is instance of myInterface class = " +(obj1 instanceof myInterface));
        System.out.println("obj2 is instance of parent class = " +(obj2 instanceof parent));
        System.out.println("obj2 is instance of child class = " +(obj2 instanceof child));
        System.out.println("obj2 is instance of parent class = " +(obj2 instanceof myInterface));
        System.out.println(obj3 instanceof Main);
    }
}