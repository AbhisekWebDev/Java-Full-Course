import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main {

    //handle checked exception
    public static void main(String[] args) {

        FileReader fileReader = null;

        try {
            fileReader = new FileReader("abhisek.txt");
        } catch (FileNotFoundException e1) {
            System.out.println("file not found");
        }
        int c;
        try {
            while ((c = fileReader.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}