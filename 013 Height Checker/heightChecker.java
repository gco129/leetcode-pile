class Solution {
    public int heightChecker(int[] heights) {
        // Make copy of heights, then sort it
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        
        // Compare the two arrays
        int matches = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != expected[i])
                matches++;
        }
        return matches;
    }
}