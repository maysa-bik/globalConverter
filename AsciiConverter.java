public class AsciiConverter {
    public static int[] toAsciiArray(String str) {
        int[] asciiValues = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            asciiValues[i] = (int) str.charAt(i);
        }

        return asciiValues;
    }
}

