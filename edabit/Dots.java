package edabit;

public class Dots {

        public static int triangle(int n) {
            return n*(1+n)/2;
        }

    public static void main(String[] args) {
        System.out.println( triangle(28));
        System.out.println(triangle(10));
        System.out.println(triangle(-12));

    }
}
