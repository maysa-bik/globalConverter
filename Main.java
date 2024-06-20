import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = InputValidator.getValidString();

        System.out.println("Do you want to encrypt the input string? (yes/no)");
        String encryptChoice = scanner.nextLine();

        if (encryptChoice.equalsIgnoreCase("yes")) {
            System.out.println("Enter the encryption key (integer): ");
            int key = scanner.nextInt();
            scanner.nextLine();  // Consume the newline
            input = CaesarCipher.encrypt(input, key);
            System.out.println("Encrypted string: " + input);
        }

        String base = BaseSelector.getBase();
        int[] asciiValues = AsciiConverter.toAsciiArray(input);
        String convertedString = BaseConverter.convertToBase(asciiValues, base);

        System.out.println("Converted string: " + convertedString);

        // Inverse conversion
        System.out.println("Do you want to decrypt the input string? (yes/no)");
        String decryptChoice = scanner.nextLine();

        if (decryptChoice.equalsIgnoreCase("yes")) {
            System.out.println("Enter the decryption key (integer): ");
            int key = scanner.nextInt();
            scanner.nextLine();  // Consume the newline
            String decryptedString = CaesarCipher.decrypt(input, key);
            System.out.println("Decrypted string: " + decryptedString);
        }
    }
}

