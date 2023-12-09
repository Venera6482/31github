package codinbat;

public class Front22 {
    public static String add(String s){
        String pre = s.substring(0,2);
        return pre+s+pre;
    }

    public static void main(String[] args) {
        System.out.println(add("Monkey"));
    }
}
