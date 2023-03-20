import java.io.*;
public class Main {

    //checked exception example
    public static void main(String[] args) {

        //throws file not found exception
        FileInputStream FIS = new FileInputStream("E:/Baburao.txt");;

        //throws an IO exception
        while((int c = FIS()) != -1) {
            System.out.println(char)c);
        }
        //throws an IO exception
        FIS.close();
    }
}