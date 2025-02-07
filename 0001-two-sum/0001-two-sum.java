class Solution {
    public int[] twoSum(int[] nums, int t) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<n;i++)
        {
            int s = t - nums[i];

            if(map.containsKey(s))
            {
                return new int[] {map.get(s),i};
            }

            map.put(nums[i],i);
        }
        return null;
    }
}