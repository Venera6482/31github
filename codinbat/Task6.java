package codinbat;

public class Task6 {
    public static String addNot(String s){
        return "not "+s;
    }
    public static String add(String s){
        if (s.length() >= 3 && s.substring(0, 3).equals("not")) {
            return s;
        }
        return "not "+s;
    }

    public static void main(String[] args) {
        System.out.println(addNot("hello"));
        System.out.println(addNot("tomorrow"));
        System.out.println(addNot("not"));
        System.out.println(add("not"));
        System.out.println(add("Merry Christmas"));
    }
}
