class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length;
        int lastgas = 0;
        int st = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0;i<n;i++)
        {
            sum1+=gas[i];
            sum2+=cost[i];
        }
        if(sum2>sum1)
        {
            return -1;
        }
        for(int i = 0;i<n;i++)
        {
            lastgas += gas[i] - cost[i];

            if(lastgas<0)
            {
                st = i+1;
                lastgas = 0;
            }
        }
        return st;
    }
}