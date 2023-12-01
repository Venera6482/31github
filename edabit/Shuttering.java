package edabit;

public class Shuttering {
    public static String shuttering(String s){
        String doubleFirst=s.substring(0,2).concat("... ");
        String second=s.concat("?");
        return doubleFirst+doubleFirst+second;
    }

    public static void main(String[] args) {
        System.out.println(shuttering("Hello"));
        System.out.println(shuttering("So amazing"));}
}
