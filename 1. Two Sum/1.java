import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
        }
        return null;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] n = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(s.twoSum(n, 7)));
    }
}
