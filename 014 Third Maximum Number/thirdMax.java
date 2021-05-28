class Solution{
	public int thirdMax(int[] nums){
		HashSet<Integer> maxes = new HashSet<>();
		// Add values to set of maxes
		for(int i = 0; i < nums.length; i++){
			maxes.add(nums[i]);
			// If fourth max is found, remove old third max
			if(maxes.size() > 3){
				maxes.remove(Collections.min(maxes));
			}
		}
		
		// If third max exists, return it
		if(maxes.size() == 3){
			return Collections.min(maxes);
		}
		else{
			// Return first max if no third max exists
			return Collections.max(maxes);
		}
	}
}