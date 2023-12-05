package codinbat;

public class FrontBack {
    public static StringBuilder back(StringBuilder s) {
        return s.reverse();
    }

    public static void main(String[] args) {
        System.out.println(back(new StringBuilder("Venera")));
        System.out.println(back(new StringBuilder("GrowthHungry")));
    }
}
