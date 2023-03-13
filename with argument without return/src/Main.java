public class Main {

    //with argument without return

    public static void findEvenOdd(int num) {
        if (num%2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
    public static void main(String[] args) {

        //argument passed in the method
        findEvenOdd(24);
    }
}