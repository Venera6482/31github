package codinbat;

public class BackAround {
    public static String back(String s){
        String last = s.substring(s.length() - 1);
        return last + s + last;
    }

    public static void main(String[] args) {
        System.out.println(back("Art"));

    }
}
