class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left;
        int right;
        for(int i=0; i<numbers.length; i++){
            left = i;
            right = left +1;
            while(left < right && right < numbers.length){
                if(numbers[left] + numbers[right] == target){
                    return new int[]{left+1, right+1};
                }
                right++;
            }
        }
        return new int[]{};
    }
}
