package wordcount;


import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class CountWords {

    public static void main(String[] args) {
        // Path to the text file (replace with your file path)
        String filePath = "largeFile.txt"; // Replace with your file path

        // Call method to process the file
        processFile(filePath);
    }

    public static void processFile(String filePath) {
        // HashMap to store the word frequencies
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Use BufferedReader to read the file line by line
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Split the line into words using space as the delimiter
                String[] words = line.split("\\W+");  // Using regex to split on non-word characters

                // Count occurrences of each word
                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.toLowerCase(); // Normalize to lowercase
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Sort the words by frequency (in descending order)
            List<Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
            sortedWords.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

            // Display the top 5 most frequent words
            System.out.println("Top 5 most frequent words:");
            int count = 0;
            for (Entry<String, Integer> entry : sortedWords) {
                if (count >= 5) break;
                System.out.println(entry.getKey() + ": " + entry.getValue());
                count++;
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}


