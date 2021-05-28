class Solution {
    public boolean validMountainArray(int[] arr) {
        // Check if length is valid
        if(arr.length < 3){
            return false;
        }
        int peak = 1;
        // Check first values to see if increasing at the start
        if(arr[0] >= arr[1]){
            return false;
        }
        
        // Strictly increasing check
        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i] == arr[i+1]){
                // Not strictly increasing
                return false;
            }
            else if(arr[i] > arr[i+1]){
                // No longer increasing
                peak = i;
                break;
            }
        }
        // Strictly decreasing check
        for(int i = peak; i < arr.length - 1; i++){
            if(arr[i] <= arr[i+1]){
                // Not strictly decreasing
                return false;
            }
        }
        return true;
    }
}