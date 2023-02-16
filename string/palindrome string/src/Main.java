import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int low=0, high=s.length()-1, flag=0;
        while (low < high)
        {
        if (s.charAt(low) != s.charAt(high))
        {
            flag = 1;
            break;
        }
            low++;
                high--;
        }
        if (flag == 0)
            System.out.println("String is Palindrome");
        else
            System.out.println("String is Not Palindrome");
    }
}