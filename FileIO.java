// Required Libraries
import java.io.*;
import javax.swing.JOptionPane;

// Start of the class FileIO
public class FileIO {

    // Executable: Main method:
    public static void main(String[] args) {
        // Variable Section:
        String sentence = "";  // Stores user input
        String fileName = "output.txt";  // File to write and read from

        // Input Section: Prompt user to enter a sentence
        sentence = JOptionPane.showInputDialog("Enter a sentence:");

        // Process Section: Write the sentence to the file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(sentence);
            writer.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error writing to file: " + e.getMessage());
        }

        // Process Section: Read the sentence from the file
        String readSentence = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            readSentence = reader.readLine();
            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading from file: " + e.getMessage());
        }

        // Output Section: Display the read sentence using a message dialog box
        JOptionPane.showMessageDialog(null, "The sentence from the file is:\n" + readSentence);
    }
}
