class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        int numZero = 0;
        for (int num : nums) {
            if(num != 0) {
                nums[pos] = num;
                pos++;
            }
            else
                numZero++;
        }
        
        for (int j = nums.length - 1; j >= nums.length - numZero; j--) {
            nums[j] = 0;
        }
    }
}