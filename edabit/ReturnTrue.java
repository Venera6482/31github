package edabit;

public class ReturnTrue {
    public static boolean sum(int a, int b){
        if (a+b<100){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(sum(70, 199));
        System.out.println(sum(80,10));
    }
}
