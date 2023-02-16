class student {
    //these are instance variables
    //these are declared inside the class but outside the method body
    String name;
    int roll;
}
public class studentRecords {
    public static void main(String[] args) {

        //creating a student class object
        student obj = new student();

        //assigning values in the variable
        obj.name = "Abhi";
        obj.roll = 10;
        System.out.println(obj.name);
        System.out.println(obj.roll);
    }
}
