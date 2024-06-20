import java.util.Scanner;

public class BaseSelector {
    public static String getBase() {
        Scanner scanner = new Scanner(System.in);
        String base;

        while (true) {
            System.out.println("Enter the base for conversion (hexadecimal, octal, binary, text or -h, -o, -b, -t): ");
            base = scanner.nextLine();
            if (isValidBase(base)) {
                break;
            } else {
                System.out.println("Invalid base. Please enter one of the following: hexadecimal, octal, binary, text or -h, -o, -b, -t.");
            }
        }

        return base;
    }

    private static boolean isValidBase(String base) {
        return base.equals("hexadecimal") || base.equals("-h") ||
               base.equals("octal") || base.equals("-o") ||
               base.equals("binary") || base.equals("-b") ||
               base.equals("text") || base.equals("-t");
    }
}


