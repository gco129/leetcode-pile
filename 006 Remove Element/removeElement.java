class Solution {
    public int removeElement(int[] nums, int val) {
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            // Ignore target values to remove them
            if(nums[i] != val){
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }
}