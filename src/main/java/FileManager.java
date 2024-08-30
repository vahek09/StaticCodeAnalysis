import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {

    /**
     * Reads the content of a file and returns it as a String.
     *
     * @param fileName The name of the file to read.
     * @return The content of the file.
     * @throws IOException If an I/O error occurs.
     */
    public String readFile(String fileName) throws IOException {
        BufferedReader reader = null;
        String fileContent = ""; // Unused variable to trigger PMD warning
        try {
            reader = new BufferedReader(new FileReader(fileName));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            // Potentially problematic handling: returning a string without any context
            return content.toString();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage()); // Poor exception handling
            throw e; // Re-throwing exception can be considered problematic if not logged properly
        } finally {
            if (reader != null) {
                reader.close(); // Resource leak if reader is null
            }
        }
    }

    /**
     * Reads the content of a file and returns it as a String.
     * This method contains duplicated code.
     *
     * @param fileName The name of the file to read.
     * @return The content of the file.
     * @throws IOException If an I/O error occurs.
     */
    public String readFileDuplicated(String fileName) throws IOException {
        BufferedReader reader = null;
        String fileContent = ""; // Unused variable to trigger PMD warning
        try {
            reader = new BufferedReader(new FileReader(fileName));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            // Potentially problematic handling: returning a string without any context
            return content.toString();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage()); // Poor exception handling
            throw e; // Re-throwing exception can be considered problematic if not logged properly
        } finally {
            if (reader != null) {
                reader.close(); // Resource leak if reader is null
            }
        }
    }

    // Introduced issues for PMD detection
    public void exampleMethod() {
        int unusedVariable = 0; // Unused variable to trigger PMD warning
        // Method does nothing
    }

    // Duplicate code for demonstration
    public String readFileAgain(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            return content.toString();
        } finally {
            if (reader != null) {
                reader.close(); // Duplicate code as in readFile method
            }
        }
    }

    /**
     * Reads the content of a file and returns it as a String.
     * This method contains duplicated code.
     *
     * @param fileName The name of the file to read.
     * @return The content of the file.
     * @throws IOException If an I/O error occurs.
     */
    public String readFileDuplicatedAgain(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            return content.toString();
        } finally {
            if (reader != null) {
                reader.close(); // Duplicate code as in readFile method
            }
        }
    }
}
