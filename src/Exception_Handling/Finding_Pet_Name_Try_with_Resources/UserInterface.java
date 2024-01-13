package Exception_Handling.Finding_Pet_Name_Try_with_Resources;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

// Custom exception class
class PetNameException extends Exception {
    public PetNameException(String message) {
        super(message);
    }
}

// InputFileReader class to read the file
class InputFileReader {
    public static BufferedReader readFile(String fileName) throws FileNotFoundException {
        return new BufferedReader(new FileReader(fileName));
    }
}

// UserInterface class with the findPetName method
public class UserInterface {
    public static String findPetName(String fileName) {
        try (
                BufferedReader reader = InputFileReader.readFile(fileName)
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (countVowels(line) == 2) {
                    return line;
                }
            }
        } catch (FileNotFoundException e) {
            return "Please give the correct file name";
        } catch (IOException e) {
            return "Error occurred while reading the names from file";
        }

        return "No pet name found with exactly two vowels";
    }

    // Helper method to count vowels in a string
    private static int countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // Main method to invoke findPetName and display the result
    public static void main(String[] args) {
        String fileName = "C:\\Users\\rahul\\IdeaProjects\\Assignment\\src\\Exception_Handling\\Finding_Pet_Name_Try_with_Resources\\inputfeed.txt"; // Replace with the actual file name

        String result = findPetName(fileName);
        System.out.println(result);
    }
}

