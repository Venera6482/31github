package codinbat;

public class IcyHot {
    public static boolean find(double temp1, double temp2){
        // Given two temperatures, return true if one is less than 0 and the other is greater than 100
        if (temp1<0||temp2>100){
            return true;
        }if (temp1>100||temp2<0){
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        System.out.println(find(-10, 200));
        System.out.println(find(2,9));
    }
}
