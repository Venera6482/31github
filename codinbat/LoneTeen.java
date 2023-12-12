package codinbat;

public class LoneTeen {
    //We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values,
    // return true if one or the other is teen, but not both.
    public static boolean teen(int a, int b){
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    public static void main(String[] args) {
        System.out.println(teen(16,100));
        System.out.println(teen(11,17));
        System.out.println(teen(50,100));
    }
}
