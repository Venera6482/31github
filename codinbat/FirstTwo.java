package codinbat;

public class FirstTwo {
    public static String first(String s){
        if (s.length()<=2){
            return s;
        }else{
            return s.substring(0,2);
        }
    }

    public static void main(String[] args) {
        System.out.println(first("Venera"));
        System.out.println(first("Xo"));
    }
}
