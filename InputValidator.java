import java.util.Scanner;

public class InputValidator {
    public static String getValidString() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Enter a string (alphanumeric only): ");
            input = scanner.nextLine();
            if (isValidString(input)) {
                break;
            } else {
                System.out.println("Invalid input. Please enter alphanumeric characters only.");
            }
        }

        return input;
    }

    private static boolean isValidString(String str) {
        return str.matches("[a-zA-Z0-9]+");
    }
}
