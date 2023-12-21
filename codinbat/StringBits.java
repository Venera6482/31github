package codinbat;

public class StringBits {
    //Given a string, return a new string made
    // of every other char starting with the
    // first, so "Hello" yields "Hlo".
    public static String stringBits(String s){
        String result="";
        for (int i=0; i<s.length(); i+=2){
            result = result + s.substring(i, i+1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(stringBits("Venera"));
    }
}
