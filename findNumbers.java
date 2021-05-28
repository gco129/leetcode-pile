class Solution {
    public int findNumbers(int[] nums) {
        int evenDigits = 0;
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int digits = 1;
            // Get digits of current number
            while(curr / 10 != 0){
                digits++;
                curr /= 10;
            }
            // Check if number of digits is even
            if(digits % 2 == 0){
                evenDigits++;
            }
        }
        return evenDigits;
    }
}