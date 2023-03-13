//different number of arguments
class methodOverloading {
    //function with 2 parameters
    public int multiply(int a, int b) {
        return a*b;
    }

    //function with 3 parameters
    public int multiply(int a, int b, int c) {
        return a*b*c;
    }
}

public class Main {
    public static void main(String[] args) {

        methodOverloading obj = new methodOverloading();
        int productOfTwoNums = obj.multiply(10, 20);
        int productOfThreeNums = obj.multiply(10, 20, 30);

        System.out.println(productOfTwoNums);
        System.out.println(productOfThreeNums);
    }
}