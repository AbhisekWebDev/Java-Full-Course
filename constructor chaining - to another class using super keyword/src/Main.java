class person {
    //default constructor
    person() {
        //invoke current class constructor 2
        this(10, 20);
        System.out.println("person class default constructor");
    }

    //parameterized constructor
    person(int a, int b) {
        System.out.println("person class parameterized constructor");
    }
}
class student extends person {
    //default constructor
    student() {
        //invoke current class constructor
        this("Abhi", "Kumar");
        System.out.println("student class default constructor");
    }

    //parameterized constructor
    student(String str1, String str2) {
        //invoke parent class constructor
        super();
        System.out.println("student class parameterized constructor");
    }
}
public class Main {
    public static void main(String[] args) {
        student obj = new student();
    }
}