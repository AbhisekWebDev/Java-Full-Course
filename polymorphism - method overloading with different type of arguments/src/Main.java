//different type of arguments
class methodOverloading {
    //function with int parameter
    public int multiply(int a, int b) {
        return a*b;
    }

    //function with double parameters
    public double multiply(double a, double b) {
        return a*b;
    }
}
public class Main {
    public static void main(String[] args) {
        methodOverloading obj = new methodOverloading();

        //method calling by passing arguments
        int productInt = obj.multiply(10, 20);
        double productDouble = obj.multiply(10.5, 20.4);

        System.out.println(productInt);
        System.out.println(productDouble);
    }
}