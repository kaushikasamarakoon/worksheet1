import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word with an odd length: ");
        String word = scanner.nextLine();
        
        // Check if the word has an odd length
        if (word.length() % 2 == 0) {
            System.out.println("The word must have an odd number of characters.");
        } else {
            // Find the middle index and character
            int middleIndex = word.length() / 2;
            char middleCharacter = word.charAt(middleIndex);
            System.out.println("The middle character is: " + middleCharacter);
        }
        
        scanner.close();
    }
}
