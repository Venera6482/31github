package codinbat;

public class IntMax {
    public static int max(int a, int b, int c){
        int max;
        if (a>b){
            max=a;
        }else {
            max=b;
        }
        if (max<c){
            max=c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max(2,9,100));
        System.out.println(max(7,90,3));
        System.out.println(max(300,3,8));
    }
}
