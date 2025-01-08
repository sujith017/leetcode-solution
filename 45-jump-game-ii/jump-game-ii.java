class Solution {
    public int jump(int[] nums) {
       int fuel = nums[0];
        int c = 1;
        int maxf = nums[0];
        if(nums.length == 1) return 0;
       if(nums.length == 2) return 1;
       for(int i = 1;i<nums.length;i++)
       {
            if(fuel <i)
            {
                c++;
                fuel = maxf; 
            }
            maxf = Math.max(maxf, i +nums[i]);
       } 
       return c;
    }
}