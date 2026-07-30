class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap<>();
        for(int n : nums){
            hash.put(n, hash.getOrDefault(n,0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(Map.Entry.comparingByValue());
        for(Map.Entry<Integer, Integer> entry : hash.entrySet()){
            heap.offer(entry);
            if(heap.size() > k){
                heap.poll();
            }
        }
        int[] resArray = new int[heap.size()];
        int index = 0;
        while(!heap.isEmpty()){
            resArray[index++] = heap.poll().getKey();
        }

        return resArray;
    }
}
