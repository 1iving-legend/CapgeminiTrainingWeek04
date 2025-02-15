import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {
    public static void main(String[] args) throws IOException {

        String fileName= "data.txt";
        try ( FileReader fr= new FileReader(fileName)){
            fr.read();
            System.out.println("File read sucessfully");
        } catch (IOException e) {
            System.out.println("IOException occered :"+ e.getMessage());
        }

    }

}

