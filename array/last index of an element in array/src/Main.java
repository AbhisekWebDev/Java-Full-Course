import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of elements
        int arr[] = new int[n];
        // Initializing array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt(); // Element whose index to be searched
        lastIndex(arr, n, x);
    }

    // Function for finding last occurrence
    static void lastIndex(int[] arr, int n, int x) {
        int last = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (x == arr[i]) {
                last = i;
                break;
            }

        }
        System.out.println(last);
    }

}