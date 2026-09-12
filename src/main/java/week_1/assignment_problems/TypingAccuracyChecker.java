public class TypingAccuracyChecker {

    static void checkTypingAccuracy(String original, String typed) {

        int matchedCharacters = 0;
        int firstMismatchPosition = -1;

        int totalCharacters = Math.min(
                original.length(), typed.length());

        for (int i = 0; i < totalCharacters; i++) {

            if (original.charAt(i) == typed.charAt(i)) {
                matchedCharacters++;
            } else if (firstMismatchPosition == -1) {
                firstMismatchPosition = i;
            }
        }

        if (original.length() != typed.length()
                && firstMismatchPosition == -1) {
            firstMismatchPosition = totalCharacters;
        }

        double accuracy =
                (matchedCharacters * 100.0) / original.length();

        System.out.printf(
                "Matched: %d/%d | Accuracy: %.2f%%",
                matchedCharacters,
                original.length(),
                accuracy);

        if (firstMismatchPosition == -1) {
            System.out.println(" | No Mismatches");
        } else {
            char originalCharacter =
                    original.charAt(firstMismatchPosition);

            char typedCharacter =
                    typed.charAt(firstMismatchPosition);

            System.out.println(
                    " | First Mismatch at position "
                    + (firstMismatchPosition + 1)
                    + " ('" + originalCharacter
                    + "' vs '" + typedCharacter + "')");
        }
    }

    public static void main(String[] args) {

        String original = "hello world";
        String typed = "hello worlt";

        checkTypingAccuracy(original, typed);
    }
}

