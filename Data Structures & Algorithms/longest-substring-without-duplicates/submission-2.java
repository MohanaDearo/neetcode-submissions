class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int longest = 0;
        Map<Character, Integer> count = new HashMap<>();
        for(int r=0; r<s.length(); r++){
            if(count.containsKey(s.charAt(r))){
               l = Math.max(count.get(s.charAt(r))+1, l);
            }

            count.put(s.charAt(r), r);
            longest = Math.max(longest, r-l+1);
        }
        return longest;
    }
}
