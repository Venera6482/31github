package codinbat;

public class WithoutEnd {
    //Given a string, return a version without the first and last
    // char, so "Hello" yields "ell". The string length will be at least 2.
    public static String end(String s){
        if (s.length()>=2){
        }
            return s.substring(1, s.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(end("Venera"));
        System.out.println(end("Growth Hungry"));
    }
}
