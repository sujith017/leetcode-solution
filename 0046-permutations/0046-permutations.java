class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generatePermutation(nums, 0, result);
        return result;
    }
    public void generatePermutation(int[] nums, int index, List<List<Integer>> result){
        if(index == nums.length){
            List<Integer> tempList = new ArrayList<>();
            for(int num: nums){
                tempList.add(num);
            }
            result.add(tempList);
            return;
        }

        for(int i=index; i<nums.length; i++){
            swap(nums, index, i);
            generatePermutation(nums, index+1, result);
            swap(nums, index, i);
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}