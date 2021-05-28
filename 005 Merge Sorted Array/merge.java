class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        int idx1 = m - 1;
        int idx2 = n - 1;
        while(i >= 0){
            if(idx1 >= 0 && idx2 >= 0){
                // Put biggest value of nums1 or nums2 into nums1 starting at the end
                if(nums1[idx1] > nums2[idx2]){
                    nums1[i] = nums1[idx1];
                    i--;
                    idx1--;
                }
                else{
                    nums1[i] = nums2[idx2];
                    i--;
                    idx2--;
                }
            }
            else if(idx1 >= 0){
                // Only nums1 values remain
                nums1[i] = nums1[idx1];
                i--;
                idx1--;
            }
            else{
                // Only nums2 values remain
                nums1[i] = nums2[idx2];
                i--;
                idx2--;
            }
        }
    }
}