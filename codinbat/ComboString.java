package codinbat;

public class ComboString {
    //Given 2 strings, a and b, return a string of
    // the form short+long+short, with the shorter
    // string on the outside and the longer string
    // on the inside. The strings will not be the same
    // length, but they may be empty (length 0).
    public static String combo(String a, String b){
        String max="";
        String min="";
        if (a.length()>b.length()){
            max=a;
            min=b;
        }else {
            max=b;
            min=a;
        }
        return min+max+min;
    }

    public static void main(String[] args) {
        System.out.println(combo("Ven","Venus"));
        System.out.println(combo("Hello", "Hi"));
    }
}
