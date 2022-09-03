package justforfun.palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter some string: ");
        String originalString = displayOriginalString();
        System.out.print("Reverse of this: ");
        System.out.println(displayReverseString(originalString));

        String reverseString = displayReverseString(originalString);
        System.out.println("Get reverse back to original: " + displayReverseString(reverseString));

        System.out.println("Is the original string a palindrome? " + isPalindrome(originalString));
        System.out.println("Original string + reverse string: " + (originalString + reverseString));
        System.out.println("Are the original string + the reverse string a palindrome? " + checkForPalindromeForTwoResults(originalString, reverseString));
    }

    public static String displayOriginalString() {
        return new Scanner(System.in).nextLine();
    }

    public static String displayReverseString(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) == string.charAt(string.length() - 1 - i))
                return true;
        }
        return false;
    }

    public static boolean checkForPalindromeForTwoResults(String textParam1, String textParam2) {
        String pal = textParam1 + textParam2;
        return isPalindrome(pal);
    }
}