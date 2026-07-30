class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grouped = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            grouped.putIfAbsent(sorted, new ArrayList<>());
            grouped.get(sorted).add(s);
        }
        return new ArrayList<>(grouped.values());
    }
}
