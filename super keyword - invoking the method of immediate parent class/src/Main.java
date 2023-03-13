class person {
    void message() {
        System.out.println("this is the base class method");

    }
}

//sub class student
class student extends person {
    void message() {
        System.out.println("this is subclass method");
    }

    //note that display() is only in the student class
    void display() {
        //this will invoke current class message() method
        message();

        //this will invoke the parent class message() method
        super.message();
    }
}
public class Main {
    public static void main(String[] args) {
        student s = new student();
        s.display();
    }
}