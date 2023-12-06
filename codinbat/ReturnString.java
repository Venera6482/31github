package codinbat;

public class ReturnString {
    public static String front3(String s){
        if (s.length()<=3){
            return s+s+s;
        }
        else {
             String sym = s.substring(0,3);
        return sym+sym+sym;
    }

}

    public static void main(String[] args) {
        System.out.println( front3("Venera"));
        System.out.println(front3("Hey"));
    }}
