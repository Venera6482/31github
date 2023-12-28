package codinbat;

public class NonStart {
    // Given 2 strings, return their concatenation, except omit the
    // first char of each. The strings will be at least length 1.
    public static String start(String a, String b) {
        if (a.length() >= 1 && b.length() >= 1) {
            return a.substring(1) + b.substring(1);
        }
        return "Length is less than 1";
    }

    public static void main(String[] args) {
        System.out.println(start("Hello", "Hi"));
        System.out.println(start("Same", "Thing"));
    }
}
