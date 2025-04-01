class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> qu = new PriorityQueue<>(
            (a,b) -> a.getValue() - b.getValue());
        for(Map.Entry<Integer,Integer> m : map.entrySet())
        {
            qu.add(m);
            if(qu.size()> k)
            {
                qu.poll();
            }
        }
        int[] result = new int[k];
        int i = 0;
        while(!qu.isEmpty())
        {
            result[i++] = qu.poll().getKey();
        }
        return result;
    }
}