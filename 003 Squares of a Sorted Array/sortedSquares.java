class Solution {
    public int[] sortedSquares(int[] nums) {
        // Create pointers for each end of the array, and result array
        int lPtr = 0;
        int rPtr = nums.length - 1;
        int[] squares = new int[nums.length];
        // Fill result array backwards, from greatest to smallest
        for(int i = nums.length-1; i >= 0; i--){
            if(Math.abs(nums[lPtr]) > Math.abs(nums[rPtr])){
                // Left value will be greater when squared
                squares[i] = nums[lPtr] * nums[lPtr];
                lPtr++;
            }
            else{
                // Right value will be greater when squared
                squares[i] = nums[rPtr] * nums[rPtr];
                rPtr--;
            }
        }
        return squares;
    }
}
