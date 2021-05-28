class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsec = 0;
        int currConsec = 0;
        for(int i = 0; i < nums.length; i++){
            // Iterate current consecutive ones
            if(nums[i] == 1){
                currConsec++;
            }
            else{
                // Check if last set of consecutive ones is the current max
                if(currConsec > maxConsec){
                    maxConsec = currConsec;
                }
                currConsec = 0;
            }
        }
        // Last check in case final set of consecutive ones is max
        if(currConsec > maxConsec){
            return currConsec;
        }
        return maxConsec;
    }
}