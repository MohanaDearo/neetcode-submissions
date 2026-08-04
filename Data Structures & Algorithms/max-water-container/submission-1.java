class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int maxVolume = 0;
        while(left <  right){
            int smallestHeight;
            if(heights[left]<heights[right]){
                smallestHeight = heights[left];
            }else{
                smallestHeight = heights[right];
            }
            int volume = smallestHeight * (right - left);
            if(volume > maxVolume){
                maxVolume = volume;
            }
            if(heights[left] < heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxVolume;
    }
}
