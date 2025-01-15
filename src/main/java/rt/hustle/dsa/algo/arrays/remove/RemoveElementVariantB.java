package rt.hustle.dsa.algo.arrays.remove;

public class RemoveElementVariantB {
    /* Given an integer array nums sorted in non-decreasing order,
     * remove the duplicates in-place such that each unique element
     * appears only once. The relative order of the elements should
     * be kept the same.
     * Then return the number of unique elements in nums.
     * Consider the number of unique elements of nums to be k,
     * To get accepted, you need to do the following things:
     * Change the array nums such that
     * The first k elements of nums contain the unique elements
     * in the order they were present in nums initially.
     * The remaining elements of nums are not important as well as the size of nums.
     * Return k.
     * Input : nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     */
    public int bigO_N(int[] nums, int val) {

        int k = nums.length, hp = 0;

        // Base Case
        if(k == 1) return k;

        for(int i = 1; i < nums.length; i++){
            if(nums[hp] == nums[i]){
                k--;
                continue;
            }
            nums[hp+1] = nums[i];
            hp++;
        }
        return k;
    }
}
