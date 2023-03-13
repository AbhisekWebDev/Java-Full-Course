public class Main {

    //without argument without return

    public static void checkEvenOdd() {
        int num = 24;

        if(num%2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
    public static void main(String[] args) {
        //method calling
        checkEvenOdd();
    }
}