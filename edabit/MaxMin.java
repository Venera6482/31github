package edabit;

public class MaxMin {
    public static int defineMax(int[] value) {
        int a;
        int max = value[0];
        for (a = 1; a < value.length; a++)
            if (value[a] > max)
                max = value[a];
        return max;
    }

    public static int defineMin(int[] value) {
        int min = value[0];
        for (int i = 0; i < value.length; i++) {
            if (min > value[i]) {
                min = value[i];
            }
        }
        return min;
    }

    public static int defineDifference(int[] nums) {
        int max = defineMax(nums);
        int min = defineMin(nums);
        return max - min;
    }

    public static void main(String[] args) {
        int[] num = {9, 39, 1, 21, 57, 89, 314, 78, 9};
        System.out.println(defineDifference(num));
    }
}
