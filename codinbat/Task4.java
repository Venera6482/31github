package codinbat;

public class Task4 {
    public static int sumDouble(int a, int b) {
        int sum=a+b;
        if(a==b){
            return sum*2;
        }else{
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumDouble(9,9));
    }
}
