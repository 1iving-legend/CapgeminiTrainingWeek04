package largefile;


import java.io.*;

public class ReadLargeFile {

    public static void main(String[] args) {
        // Path to the large text file (500MB+)
        String filePath = "large_log_file.txt"; // Replace with your file path

        // Call method to read and process the file
        processFile(filePath);
    }

    public static void processFile(String filePath) {
        // Use BufferedReader to read the file efficiently line by line
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Check if the line contains the word "error" (case insensitive)
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}


