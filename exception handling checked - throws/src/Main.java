import java.io.FileInputStream;
import java.io.IOException;
public class Main {

    //declaring exception using a throes keyword in the main method
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("abhisek.txt");

        int c;

        while ((c = fileInputStream.read()) != -1) {
            System.out.println((char) c);
        }
        fileInputStream.close();
    }
}