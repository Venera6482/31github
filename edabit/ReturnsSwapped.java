package edabit;

public class ReturnsSwapped {
    public static String swapped(String firstName, String lastName) {

        return lastName + " " + firstName;
    }

    public static String swapped2(String s) {
        String[] names = s.split(" ");
        return names[1] + " " + names[0];
    }

    public static void main(String[] args) {
        System.out.println(swapped("Venera", "Kochkonova"));
        System.out.println(swapped2("Nick Wujicic"));
        System.out.println(swapped2("Taalai Djumabaev"));
    }
}
