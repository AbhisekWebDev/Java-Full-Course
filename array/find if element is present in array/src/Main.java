//find if an element in an array is present or not
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        int arrr[] = new int[o];
        for (int i=0 ; i<o ; i++)
            arrr[i] = sc.nextInt();

        int x = sc.nextInt();
        int rslt = search(arrr, arrr.length, x);
        if (rslt == -1)
            System.out.println("element not present in array");
        else
            System.out.println("element is present in array " + rslt);
    }
    static int search(int arrr[], int o , int x)
    {
        for (int i=0 ; i<o ; i++)
            if (arrr[i] == x)

        return -1;
    }
}