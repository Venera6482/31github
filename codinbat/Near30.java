package codinbat;

public class Near30 {
    // Given 2 int values, return true if they are both in the range 30..40
    // inclusive, or they are both in the range 40..50 inclusive.
    public static boolean nearNums(int a, int b){
        if(a>=30 && a<=50 &&  b>=30 && b<= 40){
            return true;
        }
        if (a>=40 && a<=50 && b>=40 && b<=50){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(nearNums(20,31));
        System.out.println(nearNums(30,40));
    }
}
