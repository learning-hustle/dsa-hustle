package rt.hustle.dsa.algo.arrays.merge;

import java.util.Arrays;

public class MergeArrayVariationA {
    /* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
     * and two integers m and n, representing the number of elements in nums1 and nums2.
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     * The final sorted array should not be returned by the function,
     * but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
     * where the first m elements denote the elements that should be merged,
     * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
     * Example -
     * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * Output: [1,2,2,3,5,6]
     */

    public void bigON(int[] nums1, int m, int[] nums2, int n){

        // base condition
        if(n == 0) return;
        if(m == 0){
            if (n >= 0) System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }

        // three pointers
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;

        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] < nums2[p2]){
                nums1[p3] = nums2[p2];
                p3--;p2--;
            }else{
                nums1[p3] = nums1[p1];
                p3--;p1--;
            }
        }
        while(p2 >= 0){
            nums1[p3] = nums2[p2];
            p3--;p2--;
        }
    }

    public void bigONLogN(int[] nums1, int m, int[] nums2, int n){
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
