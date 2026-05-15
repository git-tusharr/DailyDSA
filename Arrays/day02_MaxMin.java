public class day02_MaxMin {

    public static int[] findMinMax(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 7};

        int[] result = findMinMax(nums);

        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);
    }
}
