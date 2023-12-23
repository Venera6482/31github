package codinbat;

public class MakeOutWord {
    //Given an "out" string length 4, such as "<<>>",
    // and a word, return a new string where the word
    // is in the middle of the out string, e.g. "<<word>>".
    // Note: use str.substring(i, j) to extract the String
    // starting at index i and going up to but not including index j.
    public static String out(String out, String word){
        return "" + out.charAt(0) + out.charAt(1)
                + word + out.charAt(2) + out.charAt(3);
    }

    public static void main(String[] args) {
        System.out.println(out("<<>>", "Hello"));
        System.out.println(out("??!!", "Yeeep"));
    }
}
