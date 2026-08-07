class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> visited = new HashMap<>();
        int left =0;
        int longest = 0;
        for (int r = 0; r< s.length(); r++){
            if(visited.containsKey(s.charAt(r))){
                left = Math.max(left, visited.get(s.charAt(r))+ 1);
            }
            visited.put(s.charAt(r), r);
            longest = Math.max(longest, r-left+1);
        }
        return longest;

    }
}
