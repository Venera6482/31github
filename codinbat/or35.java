package codinbat;

public class or35 {
    public static boolean or(int n){
        if (n%3==0||n%5==0){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(or(38));
        System.out.println(or(98));
        System.out.println(or(0000));
    }
}
