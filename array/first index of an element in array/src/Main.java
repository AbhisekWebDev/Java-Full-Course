import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no. of elements
        int arr[] = new int[n];
        // initializing array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt(); // element whose index to be searched
        firstIndex(arr, n, x);
    }

    // Function for finding first occurrence
    static void firstIndex(int[] arr, int n, int x) {
        int first = -1;
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                first = i;
                break;
            }
        }

        System.out.println(first);
    }

}