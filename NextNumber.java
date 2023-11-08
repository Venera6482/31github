public class NextNumber {
    public int increase(int x){
            return ++x;
        }


    public static void main(String[] args) {
        NextNumber num = new NextNumber();
        num.increase(-3);
    }
}
