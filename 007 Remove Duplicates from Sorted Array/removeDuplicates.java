class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case check
        if(nums.length == 0){
            return 0;
        }
        // Initialize idx, first value can't be duplicate
        int idx = 1;
        // Ignore duplicates
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[idx-1]){
                // If not a duplicate, copy value to next open spot
                nums[idx] = nums[i];
                idx++;
            }
        }
        // Account for first value when returning
        return idx;
    }
}