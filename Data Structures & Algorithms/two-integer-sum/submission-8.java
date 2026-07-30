class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>();
        int complement;
        for(int i=0; i<nums.length; i++){
            complement = target - nums[i];
            if(result.containsKey(complement)){
                return new int[]{result.get(complement), i};
            }
            result.put(nums[i], i);
        }
        return new int[]{};
    }
}
