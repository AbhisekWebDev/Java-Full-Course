
//** NOTE THE PARAMETER PASSING IS ALWAYS ALWAYS ALWAYS MADE BY VALUE.
//WHENEVER WE CREATE A VARIABLE OF A TYPE WE PASS A COPY OF ITS VALUE TO THE METHOD
public class Main {

    public static void print(int arr[]) {
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void increment(int arr1[]) {
        for (int i = 0 ; i < 5 ; i++) {
            arr1[i]++;
        }
    }
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        //reference to array is passed
        print(arr);



        int arr1[] = {1, 2, 3, 4, 5};
        increment(arr1);
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println(arr[i]);
        }
    }
}