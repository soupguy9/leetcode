class Solution {
    public int singleNumber(int[] nums) {
        /*
        First try - didn't think of poping instead of adding to the list
        
        Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        int single = 0;
        ArrayList tmp = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                map.get(nums[i]).add(new Integer(i));
            }
            else {
                map.put(nums[i], new ArrayList<Integer>());
                map.get(nums[i]).add(new Integer(i));
            }
        }
        
        for (int j = 0; j < nums.length; j++) {
            if (map.get(nums[j]).size() != 2) {
                single = nums[j];
                break;
            }
        }*/
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int single = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                map.remove(nums[i]);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        for (Integer j : map.keySet()) {
            single = j;
        }
        
        return single;
    }
}