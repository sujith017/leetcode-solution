class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        int[] arr = new int[2];
        while(l<r)
        {
            int s = numbers[l]+numbers[r];

            if(s==target)
            {
                arr[0] = l+1;
                arr[1] = r+1;
                return arr;
            }
            else if(s<target)
            {
                l++;
            }
            else{
                r--;
            }
        }
        return arr;
    }
}