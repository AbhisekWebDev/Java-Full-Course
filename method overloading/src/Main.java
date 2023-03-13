public class Main {

    //method overloading with changing the no of arguments

    //function with two parameters
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    //function with two parameters
    public  static  int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }


    //method overloading with changing the data type of arguments

    //function with two int parameters
    public static int subtract(int a, int b) {
        return a-b;
    }

    //function with two double parameters
    public static double subtract(double a, double b) {
        return a-b;
    }

    public static void main(String[] args) {
        //method calling by passing arguments
        int sumOfTwoNums = Main.add(10,20);
        int sumOfThreeNums = Main.add(10,20,30);
        System.out.println(sumOfTwoNums);
        System.out.println(sumOfThreeNums);



        int subtractOfTwoNums = Main.subtract(10,20);
        double subtractOfTwoDoubleNums = Main.subtract(10.5, 5.6);
        System.out.println(subtractOfTwoNums);
        System.out.println(subtractOfTwoDoubleNums);
    }
}