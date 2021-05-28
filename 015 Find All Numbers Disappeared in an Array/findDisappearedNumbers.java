class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> missing = new ArrayList<Integer>();
        
        // Fill list with all numbers 1 to n
        for(int i = 0; i < nums.length; i++){
            missing.add(i + 1);
        }
        // Track which numbers appear
        for(int i = 0; i < nums.length; i++){
           missing.set(nums[i]-1, -1);
        }
        // Remove values found in nums from missing list (check backwards due to shrinking size)
        for(int i = nums.length - 1; i >= 0; i--){
            if(missing.get(i) == -1){
                missing.remove(i);
            }
        }
        return missing;
    }
}