class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            int index = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    index = j;
                    break;
                }
            }
            int ans = -1;
            for (int k = index + 1; k < nums2.length; k++) {
                if (nums2[k] > nums2[index]) {
                    ans = nums2[k];
                    break;
                }
            }
            nums1[i] = ans;
        }
        return nums1;
    }
}