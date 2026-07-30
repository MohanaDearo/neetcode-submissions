class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum;
        int[] indices = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                sum = 0;
                sum = nums[i] + nums[j];
                if(sum == target){
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
            }
        }
        return indices;
    }
}
