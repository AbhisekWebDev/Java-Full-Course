public class Main {

    public static int[] numbers() {
        int a[] = new int[3];
        a[0] = 2;
        a[1] = 3;
        a[2] = 4;
        return a;
    }
    public static void main(String[] args) {
        int a[] = numbers();
        for (int i = 0 ; i < 3 ; i++)
            System.out.println(a[i]);
    }
}