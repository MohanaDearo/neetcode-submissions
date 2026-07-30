class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag = false;
        Map<Integer, Integer> visited = new HashMap<>();
        for(int n : nums){
            if(visited.containsKey(n)){
                flag = true;
                break;
            }
            visited.put(n, visited.getOrDefault(n, 0)+1);
        }
        return flag;
    }
}