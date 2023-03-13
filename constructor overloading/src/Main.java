class employee {
    //data member
    String name;
    int id, sal;

    //constructor with one argument
    employee(int id1) {
        id = id1;
    }

    //constructor with 2 arguments
    employee(int id1, String s) {
        id = id1;
        name = s;
    }

    //constructor with 3 arguments
    employee(int id1, String s, int salary) {
        id = id1;
        name = s;
        sal = salary;
    }

    //method to display id, name and sal
    public void show() {
        System.out.println(id + " " + name + " " + sal);
    }
}
public class Main {
    public static void main(String[] args) {

        //passing values in constructor
        employee obj1 = new employee(200);
        employee obj2 = new employee(215, "ABHI");
        employee obj3 = new employee(230, "ABHISEK", 500000);

        //displaying the result
        obj1.show();
        obj2.show();
        obj3.show();
    }
}