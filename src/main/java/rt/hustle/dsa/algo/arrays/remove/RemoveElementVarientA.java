package rt.hustle.dsa.algo.arrays.remove;

public class RemoveElementVarientA {
    public int bigO_N(int[] nums, int val) {

        int i = 0, j = nums.length - 1, k = nums.length - 1;

        while(i < j){
            if(nums[i] != val){
                i++;
                continue;
            }
            while(nums[j] == val){
                j--;
                k--;
            }
            int t = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
            j--;
            k--;
            i++;
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveElementVarientA obj = new RemoveElementVarientA();
        obj.bigO_N(new int[]{3, 2, 2, 3}, 3);
    }
}
