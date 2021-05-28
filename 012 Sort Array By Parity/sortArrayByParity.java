class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // Edge case check
        if(nums.length <= 1){
            return nums;
        }
        int evenPtr = 0;
        for(int i = 0; i < nums.length; i++){
            // Swap even numbers to the front
            if(nums[i] % 2 == 0){
                int temp = nums[evenPtr];
                nums[evenPtr] = nums[i];
                nums[i] = temp;
                evenPtr++;
            }
        }
        return nums;
    }
}