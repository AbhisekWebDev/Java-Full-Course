public class Main {
    public static int sum() {

        //without argument with return

        int a = 10, b = 20, sum = a + b;

        return sum;
    }

    public static void main(String[] args) {

        //no argument passed in the method

        int sum = sum();

        System.out.println(sum);
    }
}