class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       for (int i = 0; i < n; i++) {
            nums1[(nums1.length - nums2.length)+i] = nums2[i];
        }

        Arrays.sort(nums1); 
    }
}