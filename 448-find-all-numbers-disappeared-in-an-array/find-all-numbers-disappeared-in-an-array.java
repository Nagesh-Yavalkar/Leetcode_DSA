class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        // Mark the numbers that are present
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            nums[index] = -Math.abs(nums[index]);
        }

        // Positive means that number is missing
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}