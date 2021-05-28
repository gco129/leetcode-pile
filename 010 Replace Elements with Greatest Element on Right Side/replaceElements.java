class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 0){
            return arr;
        }
        // Set max to final value, set final value to -1
        int max = arr[arr.length-1];
        arr[arr.length-1] = -1;
        // Start from second to last element, check for max
        for(int i = arr.length-2; i >=0; i--){
            // Change max if greater value is found
            if(arr[i] > max){
                int curr = arr[i];
                arr[i] = max;
                max = curr;
            }
            else{
                arr[i] = max;
            }
        }
        return arr;
    }
}