package rt.hustle.dsa.algo.arrays.remove;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveElementVariationATest {
    private RemoveElementVariantA remove;

    @BeforeEach
    void setUp() {
        remove = new RemoveElementVariantA();
    }

    @Test
    public void testBigO_N() {

        RemoveElementVariantA re = new RemoveElementVariantA();

        // Test case 1: Standard case with multiple occurrences of val
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = re.bigO_N(nums1, val1);
        assertEquals(2, k1, "Expected 2 elements not equal to 3");
        assertArrayEquals(new int[]{2, 2}, extractFirstKElements(nums1, k1));

        // Test case 2: Array with no occurrences of val
        int[] nums2 = {1, 2, 3, 4};
        int val2 = 5;
        int k2 = re.bigO_N(nums2, val2);
        assertEquals(4, k2, "Expected all elements to remain as none are equal to 5");
        assertArrayEquals(new int[]{1, 2, 3, 4}, extractFirstKElements(nums2, k2));

        // Test case 3: Array with all elements equal to val
        int[] nums3 = {7, 7, 7};
        int val3 = 7;
        int k3 = re.bigO_N(nums3, val3);
        assertEquals(0, k3, "Expected no elements to remain as all are equal to 7");
        assertArrayEquals(new int[]{}, extractFirstKElements(nums3, k3));

        // Test case 4: Empty array
        int[] nums4 = {};
        int val4 = 1;
        int k4 = re.bigO_N(nums4, val4);
        assertEquals(0, k4, "Expected no elements as the array is empty");
        assertArrayEquals(new int[]{}, extractFirstKElements(nums4, k4));

        // Test case 5: Array with one element equal to val
        int[] nums5 = {5};
        int val5 = 5;
        int k5 = re.bigO_N(nums5, val5);
        assertEquals(0, k5, "Expected no elements to remain as the only element is equal to 5");
        assertArrayEquals(new int[]{}, extractFirstKElements(nums5, k5));

        // Test case 6: Array with one element not equal to val
        int[] nums6 = {4};
        int val6 = 5;
        int k6 = re.bigO_N(nums6, val6);
        assertEquals(1, k6, "Expected one element to remain as it is not equal to 5");
        assertArrayEquals(new int[]{4}, extractFirstKElements(nums6, k6));

        // Test case 7: Mixed elements, val present multiple times
        int[] nums7 = {1, 2, 3, 4, 2, 3, 3};
        int val7 = 3;
        int k7 = re.bigO_N(nums7, val7);
        assertEquals(5, k7, "Expected 5 elements not equal to 3");
        assertArrayEquals(new int[]{1, 2, 4, 2, 2}, extractFirstKElements(nums7, k7));
    }

    // Helper method to extract the first k elements from the array
    private int[] extractFirstKElements(int[] nums, int k) {
        int[] result = new int[k];
        System.arraycopy(nums, 0, result, 0, k);
        return result;
    }
}