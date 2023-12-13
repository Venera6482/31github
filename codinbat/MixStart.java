package codinbat;

public class MixStart {
    //Return true if the given string begins with "mix", except
    // the 'm' can be anything, so "pix", "9ix" .. all count.
    public static boolean mix(String s){
        if (s.substring(1, 3).equals("ix")){
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        System.out.println(mix("six"));
        System.out.println(mix("Netflix"));
        System.out.println(mix("2ix"));
    }
}
