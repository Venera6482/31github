package codinbat;

public class StringSplosion {
    //Given a non-empty string like "Code" return a string like "CCoCodCode".
    public static String stringSplosion(String str) {
        String result = "";
        // On each iteration, add the substring of the chars 0..i
        for (int i=0; i<str.length(); i++) {
            result = result + str.substring(0, i+1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(stringSplosion("Venera"));
        System.out.println(stringSplosion("World"));
    }
}
