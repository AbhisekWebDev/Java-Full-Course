import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //taking 1st input
        System.out.println("enter 1st value");
        int a = sc.nextInt();

        //taking 2nd input
        System.out.println("enter 2nd value");
        int b = sc.nextInt();

        int divide = a/b;

        System.out.println("quotient of " + a + "/" + b + "is " + divide);
    }
}

//arithmatic exception ka error dikhayega agar thik se run nahi kiya to.