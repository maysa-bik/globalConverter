public class InverseBaseConverter {
    public static String convertFromBase(String str, String base) {
        String[] values = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String value : values) {
            switch (base) {
                case "hexadecimal":
                case "-h":
                    result.append((char) Integer.parseInt(value, 16));
                    break;
                case "octal":
                case "-o":
                    result.append((char) Integer.parseInt(value, 8));
                    break;
                case "binary":
                case "-b":
                    result.append((char) Integer.parseInt(value, 2));
                    break;
                case "text":
                case "-t":
                    result.append(value);
                    break;
            }
        }

        return result.toString();
    }
}

