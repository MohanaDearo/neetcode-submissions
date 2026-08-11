class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> group = new HashMap<>();
       for(String s : strs){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        group.putIfAbsent(sorted, new ArrayList<>());
        group.get(sorted).add(s);
       }

       return new ArrayList<>(group.values());
    }
}
