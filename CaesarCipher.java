public class CaesarCipher {
    public static String encrypt(String str, int shift) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                char base = (Character.isLowerCase(c)) ? 'a' : 'A';
                encrypted.append((char) ((c - base + shift) % 26 + base));
            } else {
                encrypted.append(c);
            }
        }

        return encrypted.toString();
    }

    public static String decrypt(String str, int shift) {
        return encrypt(str, 26 - shift);
    }
}

