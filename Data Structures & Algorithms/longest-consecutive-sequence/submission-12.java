class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int maxCount = 1;
        int currentCount = 1;
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        
        for(int n:nums){
            boolean isStartOfSequence = true;
            if(set.contains(n-1)){
                isStartOfSequence = false;
            }
            if(isStartOfSequence){
                while(set.contains(n+1)){
                    currentCount++;
                    n++;
                }
                maxCount = Math.max(currentCount, maxCount);
                currentCount = 1;
            }
        }
        maxCount = Math.max(currentCount, maxCount);
        return maxCount;
    }
}
