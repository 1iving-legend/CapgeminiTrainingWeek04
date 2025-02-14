package pipedstreams;

import java.io.*;

public class InterThreadCommunication {

    public static void main(String[] args) {
        // Create the PipedInputStream and PipedOutputStream
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        try {
            // Connect the PipedOutputStream to PipedInputStream
            pos.connect(pis);

            // Create writer and reader threads
            Thread writerThread = new Thread(new WriterThread(pos));
            Thread readerThread = new Thread(new ReaderThread(pis));

            // Start the threads
            writerThread.start();
            readerThread.start();
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }

    // Writer thread that writes data to the PipedOutputStream
    static class WriterThread implements Runnable {
        private PipedOutputStream pos;

        public WriterThread(PipedOutputStream pos) {
            this.pos = pos;
        }

        @Override
        public void run() {
            try {
                String data = "Hello from Writer Thread!";
                byte[] bytes = data.getBytes();

                // Write data to PipedOutputStream
                System.out.println("Writer Thread: Writing data...");
                pos.write(bytes);
                pos.flush();  // Ensure data is written
                System.out.println("Writer Thread: Data written successfully.");
            } catch (IOException e) {
                System.out.println("IOException in Writer Thread: " + e.getMessage());
            } finally {
                try {
                    pos.close();  // Close the stream after writing
                } catch (IOException e) {
                    System.out.println("IOException while closing Writer Stream: " + e.getMessage());
                }
            }
        }
    }

    // Reader thread that reads data from the PipedInputStream
    static class ReaderThread implements Runnable {
        private PipedInputStream pis;

        public ReaderThread(PipedInputStream pis) {
            this.pis = pis;
        }

        @Override
        public void run() {
            try {
                byte[] buffer = new byte[1024]; // Buffer to store the incoming data
                int bytesRead;

                // Read data from PipedInputStream
                System.out.println("Reader Thread: Waiting for data...");
                while ((bytesRead = pis.read(buffer)) != -1) {
                    String data = new String(buffer, 0, bytesRead);
                    System.out.println("Reader Thread: Data received: " + data);
                }
            } catch (IOException e) {
                System.out.println("IOException in Reader Thread: " + e.getMessage());
            } finally {
                try {
                    pis.close();  // Close the stream after reading
                } catch (IOException e) {
                    System.out.println("IOException while closing Reader Stream: " + e.getMessage());
                }
            }
        }
    }
}
