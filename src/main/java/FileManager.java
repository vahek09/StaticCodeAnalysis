/**
 * Some class for checking reports
 * */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {

    public String readFile(String fileName) throws IOException {
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
                reader.close();
            }
        }
    }
}
