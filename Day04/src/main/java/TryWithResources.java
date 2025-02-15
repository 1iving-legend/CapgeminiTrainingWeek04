import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {


        String fileName = "source";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String data = br.readLine();
            System.out.println(data);
        } catch (IOException e) {
            System.out.println("File not found !!!");
        }

    }

}
