class Solution {
    public int thirdMax(int[] nums) {
        int idxFirst = 0;
        int idxSecond = -1;
        int idxThird = -1;
        // Determine maximums
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[idxFirst]){
                idxThird = idxSecond;
                idxSecond = idxFirst;
                idxFirst = i;
            }
            else if((idxSecond == -1 || nums[i] > nums[idxSecond]) && nums[i] != nums[idxFirst]){
                // Second max is either empty or greater than current second max, AND not a duplicate
                idxThird = idxSecond;
                idxSecond = i;
            }
            else if((idxThird == -1 || nums[i] > nums[idxThird]) && idxSecond != -1 && nums[i] != nums[idxSecond] && nums[i] != nums[idxFirst]){
                // Third max is either empty or greater than current third max, AND second max exists, AND is not a duplicate
                idxThird = i;
            }
        }
        // Return the third max if possible
        if(idxThird != -1){
            return nums[idxThird];
        }
        else{
            return nums[idxFirst];
        }
    }
}
