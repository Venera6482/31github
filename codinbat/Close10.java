package codinbat;

public class Close10 {
    //Given 2 int values, return whichever value
    // is nearest to the value 10, or return 0 in
    // the event of a tie. Note that Math.abs(n) returns
    // the absolute value of a number.
    public static int ten(int a, int b){
        int result=Math.abs(10-a);
        int result2=Math.abs(10-b);

        if (result>result2){
            return result;
        }if (result==result2){
            return 0;
        }else {
            return result2;
        }
    }

    public static void main(String[] args) {
        System.out.println(ten(9,1));
        System.out.println(ten(8,2));
    }
}
