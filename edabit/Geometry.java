package edabit;

public class Geometry {
    public static int perimeter(int length, int width){
        int formula=(length+width)*2;
        return formula;
    }

    public static void main(String[] args) {
        int result = perimeter(9,11);
        System.out.printf("The rectangle perimeter is "+result);
    }
}
