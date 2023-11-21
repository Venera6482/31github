package edabit;

public class AgeIntoDays {
    public static int intoDays(int age){
        return age*=365;
    }

    public static void main(String[] args) {
        System.out.println(intoDays(22));
    }
}
