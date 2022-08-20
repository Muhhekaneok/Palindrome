package justforfun.palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter some text: ");
        String string = displayText();
        System.out.print("Reverse of this: ");
        System.out.println(displayReverseString(string));

        String getReverseBackToOriginal = displayReverseString(string);
        System.out.println("Get reverse back to original: " + displayReverseString(getReverseBackToOriginal));
    }

    public static String displayText() {
        return new Scanner(System.in).nextLine();
    }

    private static String displayReverseString(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }
}