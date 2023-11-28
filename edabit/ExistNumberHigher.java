package edabit;

public class ExistNumberHigher {
    public static boolean exist(int [] arr, int n){
        if (arr.length==0) return false;
        for (int i:arr){
            if(i>=n) return true;
    }
        return false;
    }

    public static void main(String[] args) {
        int[] ar={2,6,90,0,236,82,-2};
        System.out.println(exist(ar, 0));
        int[] ar2 = {};
        System.out.println(exist(ar2, 0));
        System.out.println(exist(ar,-2));
    }
}
