package rt.hustle.dsa.algo.arrays.remove;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveElementVariantBTest {

    @Test
    public void testBigO_N() {
        RemoveElementVariantB re = new RemoveElementVariantB();

        // Test case 1: Standard case with duplicates
        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k1 = re.bigO_N(nums1, 0);
        assertEquals(5, k1, "Expected 5 unique elements");
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, extractFirstKElements(nums1, k1));

        // Test case 2: Array with no duplicates
        int[] nums2 = {1, 2, 3, 4, 5};
        int k2 = re.bigO_N(nums2, 0);
        assertEquals(5, k2, "Expected 5 unique elements");
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, extractFirstKElements(nums2, k2));

        // Test case 3: Array with all elements the same
        int[] nums3 = {7, 7, 7, 7};
        int k3 = re.bigO_N(nums3, 0);
        assertEquals(1, k3, "Expected 1 unique element");
        assertArrayEquals(new int[]{7}, extractFirstKElements(nums3, k3));

        // Test case 4: Empty array
        int[] nums4 = {};
        int k4 = re.bigO_N(nums4, 0);
        assertEquals(0, k4, "Expected 0 elements as the array is empty");
        assertArrayEquals(new int[]{}, extractFirstKElements(nums4, k4));

        // Test case 5: Array with one element
        int[] nums5 = {5};
        int k5 = re.bigO_N(nums5, 0);
        assertEquals(1, k5, "Expected 1 unique element as the array has only one element");
        assertArrayEquals(new int[]{5}, extractFirstKElements(nums5, k5));

        // Test case 6: Array with mixed duplicates at start and end
        int[] nums6 = {1, 1, 2, 3, 3, 4, 4, 5, 5, 5};
        int k6 = re.bigO_N(nums6, 0);
        assertEquals(5, k6, "Expected 5 unique elements");
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, extractFirstKElements(nums6, k6));

        // Test case 7: Long array with random duplicates
        int[] nums7 = {0, 0, 1, 2, 2, 3, 3, 3, 4, 5, 5, 6, 6, 6, 7};
        int k7 = re.bigO_N(nums7, 0);
        assertEquals(8, k7, "Expected 8 unique elements");
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7}, extractFirstKElements(nums7, k7));
    }

    // Helper method to extract the first k elements from the array
    private int[] extractFirstKElements(int[] nums, int k) {
        int[] result = new int[k];
        System.arraycopy(nums, 0, result, 0, k);
        return result;
    }
}
