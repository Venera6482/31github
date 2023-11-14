package edabit;

public class LessOrEqual {
    public static boolean lessThanOrEqualToZero(int num){
        if(num<=0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(lessThanOrEqualToZero(-4));
    }
}
