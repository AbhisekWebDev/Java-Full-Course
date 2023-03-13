import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 numbers");
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your numbers are");
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}