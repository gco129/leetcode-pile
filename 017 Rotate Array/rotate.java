class Solution {
    public void rotate(int[] nums, int k) {
        // Reduce k to only rotate the amount necessary
        k %= nums.length;
        // Check if rotation is not needed
        if(k == 0){
            return;
        }
        // Rotate by reversing the entire array, then reversing each half
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int startIdx, int endIdx){
        // Reverses input array from startIdx to endIdx
        while(startIdx < endIdx){
            int temp = nums[startIdx];
            nums[startIdx++] = nums[endIdx];
            nums[endIdx--] = temp;
        }
    }
}