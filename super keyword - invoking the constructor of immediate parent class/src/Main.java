class person {
    //default constructor
    person() {
        System.out.println("parent class constructor");
    }
}

//child class student
class student extends person {
    student() {
        //invoke parent class constructor
        super();
        System.out.println("child class constructor");
    }
}
public class Main {
    public static void main(String[] args) {
        student s = new student();
    }
}