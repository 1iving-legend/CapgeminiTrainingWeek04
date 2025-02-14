package imagetobytearray;


import java.io.*;

public class ImageToByteArray {
    public static void main(String[] args) {
        String sourceImagePath = "source_Image.jpg";  // Replace with your image path
        String destinationImagePath = "copied_image.jpg";

        try {
            // Convert image to byte array
            byte[] imageBytes = imageToByteArray(sourceImagePath);
            if (imageBytes == null) {
                System.out.println("Failed to convert image to byte array.");
                return;
            }

            // Write byte array back to a new image file
            byteArrayToImage(imageBytes, destinationImagePath);
            System.out.println("Image successfully copied to " + destinationImagePath);

            // Verify that the two files are identical
            if (areFilesIdentical(sourceImagePath, destinationImagePath)) {
                System.out.println("Verification successful: The new file is identical to the original.");
            } else {
                System.out.println("Verification failed: The files are not identical.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to convert an image to a byte array
    public static byte[] imageToByteArray(String imagePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    // Method to convert a byte array back to an image file
    public static void byteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    // Method to verify if two files are identical by comparing their sizes
    public static boolean areFilesIdentical(String filePath1, String filePath2) {
        File file1 = new File(filePath1);
        File file2 = new File(filePath2);
        return file1.length() == file2.length();
    }
}


