package edabit;

public class LastWords {
    public static boolean lastABC(String s1, String s2){
        return (s1.endsWith(s2)) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(lastABC("123", "123"));
        System.out.println(lastABC("Hey", "Hello"));
    }
}
