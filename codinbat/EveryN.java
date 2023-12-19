package codinbat;

public class EveryN {
    //Given a string and a non-negative int n,
    // return a larger string that is n copies
    // of the original string.
    public static String end(String s, int n){
        String result="";
        for (int i=0; i<n; i++){
            result +=s;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(end(" Venera", 2));
        System.out.println(end(" Growth Hungry", 3));
    }
}
