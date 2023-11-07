public class NumsEqual {
    public boolean isSameNum(int y, int x){
        if (y==x){
            System.out.printf(y+" and "+x+" are equal");
            return true;
        }
        System.out.printf(y+" and "+x+" are not equal");
        return false;

    }

    public static void main(String[] args) {
        NumsEqual nums = new NumsEqual();
        nums.isSameNum(10,10);

    }
}
