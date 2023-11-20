package edabit;

public class Concat {
    public static String con(String str){
        return str.concat("Edabit");
    }

    public static void main(String[] args) {
        System.out.println(con("Create"));
        System.out.println(con("Love"));
        System.out.println(con("1627"));
    }
}
