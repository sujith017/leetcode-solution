class Solution {
    public int subarraySum(int[] nums, int k) {
        int c = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int cc = 0;
        for(int num : nums)
        {
            c+=num;
            if(map.containsKey(c-k))
            {
                cc+=map.get(c-k);
            }

            map.put(c,map.getOrDefault(c,0)+1);

        }
        return cc;
    }
}