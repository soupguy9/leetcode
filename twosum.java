class Solution {
    public int[] twoSum(int[] nums, int target) throws IllegalArgumentException {
        /*int[] result = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;*/
        
        /*two-pass. create hash table [val[i], i] -- loop thru array
        //see if target - val[i] exists in hash table; -- loop thru array, check hash
        Map<Integer, Integer> hashedVals = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            hashedVals.put(nums[i], i);
        }
        System.out.println(Arrays.asList(hashedVals));
        for (int j = 0; j < nums.length; j++) {
            System.out.println("Checking: " + target + " - " + nums[j]);
            if (hashedVals.get(target-nums[j]) != null && hashedVals.get(target-nums[j]) != j) {
                return new int[] {j, hashedVals.get(target-nums[j])};
            }
        }*/
        
        //one-pass :: thought I had this, must have messed up somewhere
        Map<Integer, Integer> hashedVals = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hashedVals.get(complement) != null && hashedVals.get(complement) != i) {
                return new int[] {i, hashedVals.get(complement)};
            }
            hashedVals.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("no resolution");
    }
}