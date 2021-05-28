class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length <= 1){
            return;
        }
        int nonZeroPtr = 0;
        for(int i = 0; i < nums.length; i++){
            // Check for non-zero values
            if(nums[i] != 0){
                // If zero is currently in front portion of nums, move up non-zero value
                if(nums[nonZeroPtr] == 0){
                    nums[nonZeroPtr] = nums[i];
                    nums[i] = 0;
                }
                nonZeroPtr++;
            }
        }
    }
}