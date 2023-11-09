public class isSeven {
    public static boolean method(int x){
        if (x==7){
            System.out.printf(x+" is equal to 7");
            return true;
        }
        System.out.println(x+" is not equal to 7");
        return false;
    }

    public static void main(String[] args) {
        method(9);
        method(7);

    }
}
