class Solution {
    static int binarySearch(int[] arr,int a,boolean findfirst)
    {
        int l = 0;
        int r = arr.length -1;
        int pos = -1;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(arr[mid]==a){
                pos = mid;
                if(findfirst)
                {
                    r = mid-1;
                }
                else{
                    l = mid+1;
                }
            }
            else if(arr[mid]<a)
            {
                l = mid+1;
            }
            else{
                r = mid - 1;
            }
        }
        return pos;
    }
    public int[] searchRange(int[] nums, int target) {
        int res = binarySearch(nums,target,true);
        int res1 = binarySearch(nums,target,false);
        return new int[] {res,res1};
    }
}