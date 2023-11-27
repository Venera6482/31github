package edabit;

public class Basic {
    public static int operation(int a, String operation, int b) {
        if (operation.equals("*")) {
            return a * b;
        }
        if (operation.equals("+")) {
            return a + b;
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        System.out.println(operation(9,"+", 89));
        System.out.println(operation(100, "/", 9));
        System.out.println(operation(-89, "*", 7));
    }
}
