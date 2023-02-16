
    //no argument no return
public class Main {
    public static void checkEvenOdd() {
        int num = 24;
        if (num % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }

    //no argument with return
    public static int sumOfTwoNums() {
        int a = 10, b = 20, sum = a+b;
        return sum;
    }

    //argument with no return
    public static void findEvenOdd(int num) {
        if (num % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }

    // argument with return
     public static int differenceOfTwoNums(int num1, int num2) {
        int diff = num1 - num2;
        //return sum
         return diff;
     }





    public static void main(String[] args) {
        //method calling without argument
        checkEvenOdd();


        //no argument passed in the method
        int sum = sumOfTwoNums();
        System.out.println(sum);


        //argument passed in the method
        int num = 35;
        findEvenOdd(num);



        //method calling with argument
        int a = 50, b = 29;
        System.out.println(differenceOfTwoNums(a,b));
    }
}