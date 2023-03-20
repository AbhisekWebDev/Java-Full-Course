public class Main {

    //multiple catch block
    public static void main(String[] args) {

        try {
            int arr[] = new int[5];
            arr[6] = 8;

            int a = 10, b = 0;
            int divide = a/b;
            System.out.println(divide);
        }
        catch (ArithmeticException e) {
            System.out.println("num can not be divided with 0");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index out of bound");
        }
        catch (Exception e) {
            System.out.println("other exceptions");
        }
    }
}