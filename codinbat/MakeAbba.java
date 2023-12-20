package codinbat;

public class MakeAbba {
    // Given two strings, a and b, return the result of putting them
    // together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi"
    public static String abba(String a, String b) {
        return a+b+b+a;
    }

    public static void main(String[] args) {
        System.out.println(abba("Hello", "World"));
        System.out.println(abba("Growth", "Hungry"));
    }
}
