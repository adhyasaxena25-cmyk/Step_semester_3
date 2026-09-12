package main.java.week_1.class_work;

public class PalindromeChecker {

    public static boolean isPalindromeIterative(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    public static boolean isPalindromeArrayReversal(String text) {
        char[] chars = text.toCharArray();
        char[] reversed = new char[chars.length];
        
        for (int i = 0; i < chars.length; i++) {
            reversed[i] = chars[chars.length - 1 - i];
        }
        
        return new String(reversed).equals(text);
    }

    public static void main(String[] args) {
        String[] testWords = {"madam", "hello"};

        for (String word : testWords) {
            System.out.println("Testing word: \"" + word + "\"");
            
            String iterRes = isPalindromeIterative(word) ? "Palindrome" : "Not Palindrome";
            String recurRes = isPalindromeRecursive(word) ? "Palindrome" : "Not Palindrome";
            String arrayRes = isPalindromeArrayReversal(word) ? "Palindrome" : "Not Palindrome";

            System.out.println("Iterative: " + iterRes + " | Recursive: " + recurRes + " | Array Reversal: " + arrayRes);
            System.out.println();
        }
    }
}