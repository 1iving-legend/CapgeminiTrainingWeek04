package upeertolower;


import java.io.*;

public class UpperToLowerConverter {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "output.txt";

        try (
                FileReader fr = new FileReader(sourceFile);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(destinationFile);
                BufferedWriter bw = new BufferedWriter(fw)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                // Convert the line to lowercase and write it to the output file
                bw.write(line.toLowerCase());
                bw.newLine();
            }
            System.out.println("File conversion completed successfully. Output written to " + destinationFile);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


