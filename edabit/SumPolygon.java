package edabit;

public class SumPolygon {
    public static int sum(int n){
        return  (n - 2) * 180;
    }

    public static void main(String[] args) {
        System.out.println(sum(20));
        System.out.println(sum(903));
        System.out.println(sum(0));
        System.out.println(sum(-857));
    }
}
