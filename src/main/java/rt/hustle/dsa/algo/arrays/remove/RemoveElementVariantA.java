package rt.hustle.dsa.algo.arrays.remove;

public class RemoveElementVariantA {
    /* Given an integer array nums and an integer val,
     * remove all occurrences of val in nums in-place.
     * The order of the elements may be changed.
     * Then return the number of elements in nums which are not equal to val.
     * Consider the number of elements in nums which are not equal to val be k,
     * To get accepted, you need to do the following things:
     * Change the array nums such that
     * The first k elements of nums contain the elements which are not equal to val.
     * The remaining elements of nums are not important as well as the size of nums.
     * Return k.
     * Input : nums = [3, 2, 2, 3], val = 3
     * Output: 2, nums = [2, 2, .., ..]
     */
    public int bigO_N(int[] nums, int val) {

        int i = 0, j = nums.length - 1, k = nums.length;

        while(i <= j){
            if(nums[i] != val){
                i++;
                continue;
            }
            while(j > 0 && nums[j] == val){
                j--;
                k--;
            }
            if(i < j) {
                int t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
                j--;
                k--;
                i++;
            }
        }
        return k;
    }
}
