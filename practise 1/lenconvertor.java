import java.util.Scanner;

public class lenconvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length in centimeters
        System.out.print("Enter length in centimeters: ");
        double centimeters = scanner.nextDouble();

        // Convert centimeters to inches (1 cm = 0.393701 inches)
        double totalInches = centimeters * 0.393701;

        // Convert inches to feet (1 foot = 12 inches)
        int feet = (int) (totalInches / 12);
        double remainingInches = totalInches % 12;

        // Output the result
        System.out.printf("%.2f cm is approximately %d feet and %.2f inches.%n", centimeters, feet, remainingInches);

        scanner.close();
    }
}
