package largefile_bufferreader;

import java.io.*;

public class LargeFileBufferReader {
    public static void main(String[] args) {
        String sourceFile = "largeFile.txt";
        String unbufferedCopy = "unbufferedCopy.txt";
        String bufferedCopy = "bufferedCopy.txt";

        System.out.println("Starting file copy comparison...");

        // Measure time for unbuffered copy
        long unbufferedTime = copyFileUsingUnbufferedStream(sourceFile, unbufferedCopy);
        System.out.println("Unbuffered Stream Copy Time: " + unbufferedTime + " ns (" + unbufferedTime / 1_000_000 + " ms)");

        // Measure time for buffered copy
        long bufferedTime = copyFileUsingBufferedStream(sourceFile, bufferedCopy);
        System.out.println("Buffered Stream Copy Time: " + bufferedTime + " ns (" + bufferedTime / 1_000_000 + " ms)");

        // Compare the times
        System.out.println("\nBuffered copy was " + (unbufferedTime / (double) bufferedTime) + "x faster than unbuffered copy.");
    }

    // Unbuffered file copy using FileInputStream and FileOutputStream
    public static long copyFileUsingUnbufferedStream(String source, String destination) {
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
        } catch (IOException e) {
            System.out.println("Unbuffered Stream Error: " + e.getMessage());
        }

        return System.nanoTime() - startTime;
    }

    // Buffered file copy using BufferedInputStream and BufferedOutputStream
    public static long copyFileUsingBufferedStream(String source, String destination) {
        long startTime = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source), 4096);
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination), 4096)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Buffered Stream Error: " + e.getMessage());
        }

        return System.nanoTime() - startTime;
    }
}

