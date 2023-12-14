package codinbat;

public class StartOz {
    //Given a string, return a string made of the first 2 chars (if present),
    // however include first char only if it is 'o' and include the second
    // only if it is 'z', so "ozymandias" yields "oz".

    //startOz("ozymandias") → "oz"
    //startOz("bzoo") → "z"
    //startOz("oxx") → "o"
    public static String start(String s) {
            String result = "";

            if (s.length() >= 1 && s.charAt(0)=='o') {
                result+= s.charAt(0);
            }
            if (s.length() >= 2 && s.charAt(1)=='z') {
                result+= s.charAt(1);
            }
            return result;
        }


    public static void main(String[] args) {
        System.out.println(start("ozjdhehf"));
        System.out.println(start("Venera"));
    }
}
