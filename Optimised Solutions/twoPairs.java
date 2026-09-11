import java.util.Arrays;

public class twoPairs {
    public static void main(String[] args) {
        int[] nums = { 3,3};
        int[] answer = twoSum(nums, 6);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int pos1 = nums[i];
                int pos2 = nums[j];
                if (pos1 + pos2 == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }

}
