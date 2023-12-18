package codinbat;

public class LastDigit {
    //Given two non-negative int values, return true if they have
    // the same last digit, such as with 27 and 57. Note that the
    // % "mod" operator computes remainders, so 17 % 10 is 7.
    public static boolean digit(int a, int b){
       int num1=a%10;
        int num2=b%10;
        if (num1==num2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(digit(17,27));
        System.out.println(digit(24,87));
    }
}
