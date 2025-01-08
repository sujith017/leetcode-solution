class Solution {
    public boolean canJump(int[] nums) {
        int fuel = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(fuel<0) return false;
            if(fuel<nums[i])
            {
                fuel = nums[i];
            }
            fuel--;
        }
        return true;
    }
}