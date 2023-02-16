//add elements of 2 arrays
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[m];

        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();

        for (int i = 0; i < m; i++)
            arr2[i] = sc.nextInt();

        int result = 0;
        for (int i = 0; i < arr1.length; i++)
            result += arr1[i];

        for (int i = 0; i < arr2.length; i++)
            result += arr2[i];


        System.out.println(result);
    }
}