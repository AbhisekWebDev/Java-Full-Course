class box {

    //member variables
    double width;
    double height;
    double depth;
}
public class Main {
    public static void main(String[] args) {

        //creating an object of box class
        box obj = new box();

        //assigning values to the object instance variables
        obj.width = 7.8;
        obj.height = 5.9;
        obj.depth = 6.3;

        double vol = obj.width * obj.height * obj.depth;
        System.out.println(vol);
    }
}