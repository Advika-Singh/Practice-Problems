public class Q2_PalindromeChecker {

    static boolean isPalindromeIterative(String text) {
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

    static boolean isPalindromeRecursive(String text) {
        return isPalindromeRecursive(text, 0, text.length() - 1);
    }

    private static boolean isPalindromeRecursive(String text, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (text.charAt(left) != text.charAt(right)) {
            return false;
        }
        return isPalindromeRecursive(text, left + 1, right - 1);
    }

    static boolean isPalindromeArrayReversal(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        return new String(reversed).equals(text);
    }

    public static void main(String[] args) {
        check("madam");
        check("hello");
    }

    private static void check(String text) {
        String iterative = isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome";
        String recursive = isPalindromeRecursive(text) ? "Palindrome" : "Not Palindrome";
        String arrayReversal = isPalindromeArrayReversal(text) ? "Palindrome" : "Not Palindrome";
        System.out.println("Iterative: " + iterative + " | Recursive: " + recursive
                + " | Array Reversal: " + arrayReversal);
    }
}
