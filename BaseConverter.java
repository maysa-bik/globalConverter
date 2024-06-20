public class BaseConverter {
    public static String convertToBase(int[] asciiValues, String base) {
        StringBuilder result = new StringBuilder();

        for (int value : asciiValues) {
            switch (base) {
                case "hexadecimal":
                case "-h":
                    result.append(Integer.toHexString(value)).append(" ");
                    break;
                case "octal":
                case "-o":
                    result.append(Integer.toOctalString(value)).append(" ");
                    break;
                case "binary":
                case "-b":
                    result.append(Integer.toBinaryString(value)).append(" ");
                    break;
                case "text":
                case "-t":
                    result.append((char) value).append(" ");
                    break;
            }
        }

        return result.toString().trim();
    }
}

