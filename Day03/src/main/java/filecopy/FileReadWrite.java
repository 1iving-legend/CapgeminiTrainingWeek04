package filecopy;

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        // Specify source and destination file paths
        String sourceFile = "source";
        String destinationFile = "destination";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {

            File file = new File(sourceFile);
            if (!file.exists()) {
                System.out.println("Source file does not exist: " + sourceFile);
                return;
            }


            fis = new FileInputStream(sourceFile);


            fos = new FileOutputStream(destinationFile);

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Failed to close the streams: " + e.getMessage());
            }
        }
    }
}
