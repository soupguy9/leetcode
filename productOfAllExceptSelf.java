class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 1;
        //populate array of products of each element left of i
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        //going from the right
        //int[] right = new int[nums.length];
        int right = 1;
        for (int j = nums.length-1; j >= 0; j--) {
            left[j] *= right;
            right = right * nums[j];
        }
        /*
        for (int n = 0; n < nums.length; n++) {
            left[n] *= right[n];
        }*/
        return left;
    }
}