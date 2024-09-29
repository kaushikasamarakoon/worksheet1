import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their full name
        System.out.print("Enter your name in the format 'First Middle Last': ");
        String fullName = scanner.nextLine();
        
        // Split the name into parts
        String[] nameParts = fullName.split(" ");

        // Ensure the user provided exactly three parts (first, middle, last)
        if (nameParts.length != 3) {
            System.out.println("Please enter a valid name in the format 'First Middle Last'.");
        } else {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];

            // Extract the middle initial
            char middleInitial = middleName.charAt(0);

            // Output the name in the desired format: Last, First M.
            System.out.println(lastName + ", " + firstName + " " + middleInitial + ".");
        }

        scanner.close();
    }
}
