import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age[] = {12,4,5,16,20};
        System.out.println("accessing elements of an array");
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]);


        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0 ; i<arr.length ; i++)
            arr[i] = sc.nextInt();
        for (int i=0 ; i<arr.length ; i++)
            System.out.println(arr[i] + " ");


        //for each loop
        int forEach[] = {10,20,30,40,50};
        for(int i : forEach)
            System.out.println(i + " ");


        //reference to array is passed
        int fun[] = {9,8,7,6,5};
        print(fun);



        int incr[] = {5,4,3,2,1};
        increment(incr);
        for (int i=0 ; i<5 ; i++)
            System.out.println(incr[i] + " ");



        int num[] = {1,2,3,4,5};
        n(num);
        for (int i=0 ; i<5 ; i++)
            System.out.println(num[i] + " ");
    }




    //passing arrays to function
    public static void print(int fun[])
    {
        for (int i=0 ; i<5 ; i++)
            System.out.println(fun[i] + " ");
    }



    public static void increment(int incr[])
    {
        for (int i=0 ; i<5 ; i++)
            incr[i]++;
    }



    //changing num with num1
    public static void n(int num[])
    {
        int num1[] = {5,4,3,2,1};
        num = num1;
        for (int i=0 ; i<5 ; i++)
            num[i]++;
    }
}




