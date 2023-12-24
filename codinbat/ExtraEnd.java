package codinbat;

public class ExtraEnd {
    //Given a string, return a new string made of 3 copies
    // of the last 2 chars of the original string. The string
    // length will be at least 2.

    public static String extra(String str) {
        if (str.length() <= 2) {
            return str + str + str;
        } else {
            String end =str.substring(str.length()-2, str.length());
            return end+end+end;
        }
    }

    public static void main(String[] args) {
        System.out.println(extra("Venera"));
        System.out.println(extra("Hi"));
    }

}