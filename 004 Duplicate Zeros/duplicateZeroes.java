class Solution {
    public void duplicateZeros(int[] arr) {
        // Search for zeros backwards
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] == 0){
                // When zero is found, shift over all values in front of it while duplicating the zero
                for(int j = arr.length-1; j >= i+1; j--){
                    arr[j] = arr[j-1];
                }
            }
        }
    }
}