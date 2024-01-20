package codinbat;

public class WithoutX {
    //Given a string, if one or both of the first 2 chars is 'x', return the
    // string without those 'x' chars, and otherwise return the string unchanged.
    // This is a little harder than it looks.
    public static String x(String s){
        if (s.length() >= 2 && (s.charAt(0) == 'x' || s.charAt(1) == 'x')) {
            if (s.charAt(0) == 'x') {
                return s.substring(1);
            } else {
                return s.charAt(0) + s.substring(2);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(x("Venus"));
        System.out.println(x("Xxkfhjg"));
    }
}
