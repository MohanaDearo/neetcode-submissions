class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> visited = new HashMap<>();
        int left;
        int right;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(visited.containsKey(nums[i])){
                continue;
            }else{
                visited.put(nums[i],i);
            }
            left = i+1;
            right = nums.length-1;
           
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0){
                    right--;
                }
                else if(sum < 0){
                    left++;
                }
                else if(sum == 0 ){
                    result.add(new ArrayList<>(List.of(nums[i], nums[left], nums[right])));
                    left++;
                    right--;
                     while(left<right && nums[left] == nums[left-1]){
                left++;
            }
            
            while(left < right && nums[right] == nums[right+1] ){
                right--;
            }
                }
                
            }
            
        }
        return result;
    }
}
