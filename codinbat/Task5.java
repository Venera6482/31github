package codinbat;

public class Task5 {
    public static int diff21(int n) {
        if(n<=21){
            return 21-n;
        }else{
            return (n-21)*2;
        }
    }

    public static void main(String[] args) {
        System.out.println(diff21(90));
    }
}
